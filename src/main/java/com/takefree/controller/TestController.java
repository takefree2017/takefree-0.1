package com.takefree.controller;

import com.takefree.common.vo.JsonSimpleObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.takefree.dataobject.TestObject;
import com.takefree.service.TestService;

@SpringBootApplication
@RestController
@RequestMapping("/test")
public class TestController {
    
    @Autowired
    private TestService testService;
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public JsonSimpleObject getById(@PathVariable int id){
        return new JsonSimpleObject(testService.getByNm(id));
    }
}
