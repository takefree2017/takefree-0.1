package com.takefree.service.impl;

import com.takefree.pojo.mapper.ConfigurationMapper;
import com.takefree.pojo.model.Configuration;
import com.takefree.service.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gaoxiang on 2017/12/11.
 */
@Service
public class ConfigurationServiceImpl implements ConfigurationService {
    @Autowired
    private ConfigurationMapper configurationMapper;

    @Override
    public List<Configuration> getConfigurations() {
        return configurationMapper.selectByExample(null);
    }
}
