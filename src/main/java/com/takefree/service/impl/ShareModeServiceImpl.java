package com.takefree.service.impl;

import com.takefree.pojo.mapper.ShareModeMapper;
import com.takefree.pojo.model.ShareMode;
import com.takefree.pojo.query.ShareModeQuery;
import com.takefree.service.ShareModeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gaoxiang on 2018/1/15.
 */
@Service
public class ShareModeServiceImpl implements ShareModeService {
    @Autowired
    private ShareModeMapper shareModeMapper;

    @Override
    public List<ShareMode> getShareModes() {
        return shareModeMapper.selectByExample(new ShareModeQuery());
    }
}
