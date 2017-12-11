package com.takefree.service;


import com.takefree.dto.model.CategoryDTO;
import com.takefree.pojo.model.Configuration;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
public interface ConfigurationService {
    public List<Configuration> getConfigurations();
}
