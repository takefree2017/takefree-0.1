package com.takefree.service.impl;

import com.takefree.pojo.mapper.ConfigurationMapper;
import com.takefree.pojo.model.Configuration;
import com.takefree.pojo.query.ConfigurationQuery;
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

    @Override
    public String getConfiguration(String configIterm) {
        ConfigurationQuery configurationQuery=new ConfigurationQuery();
        configurationQuery.createCriteria().andConfigItemEqualTo(configIterm);
        List<Configuration> configurations= configurationMapper.selectByExample(configurationQuery);
        if(configurations.size()>0){
            return configurations.get(0).getConfigValue();
        }else {
            return null;
        }
    }
}
