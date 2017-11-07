package com.takefree.common.handle;

/**
 * Created by gaoxiang on 2017/7/17.
 */
import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.annotation.Authorization;
import com.takefree.common.config.Constants;
import com.takefree.common.entry.Token;
import com.takefree.common.service.TokenManager;
import com.takefree.common.web.constant.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * 自定义拦截器，判断此次请求是否有权限
 *
 */
public class AuthorizationInterceptor extends HandlerInterceptorAdapter {
    @Autowired
    private TokenManager manager;

    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        // 如果不是映射到方法直接通过
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();

        // 如果验证 token 失败，并且方法注明了 Authorization，返回 401 错误
        if (method.getAnnotation(Authorization.class) != null) {
            // 从 header 中得到 token
            String tokenKey = request.getHeader(Constants.TAKEFREE_TOKEN);
            if(tokenKey==null){
                tokenKey=request.getParameter(Constants.TAKEFREE_TOKEN);
            }
            if(tokenKey==null) {
                Cookie[] cookies = request.getCookies();
                if (null != cookies) {
                    for (Cookie cookie : cookies) {
                        if (Constants.TAKEFREE_TOKEN.equals(cookie.getName())) {
                            tokenKey = cookie.getValue();
                        }
                    }
                }
            }

            if(tokenKey==null){
                throw new SimpleHttpException(HttpStatus.UNAUTHORIZED, "Unauthorized");
            }
            // 验证 token
            Token token = manager.getToken(tokenKey);
            if(token==null){
                throw new SimpleHttpException(HttpStatus.UNAUTHORIZED,"Unauthorized");
            }

            request.setAttribute(Constants.TAKEFREE_TOKEN, token);
            manager.refreshToken(token);
            return true;
        }
        return true;
    }
}

