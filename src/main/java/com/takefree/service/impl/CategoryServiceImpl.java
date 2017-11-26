package com.takefree.service.impl;

import com.takefree.common.util.BeanUtils;
import com.takefree.dto.mapper.CategoryDTOMapper;
import com.takefree.dto.model.CategoryDTO;
import com.takefree.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDTOMapper categoryDTOMapper;

//    @Autowired
//    private CategoryInfoMapper categoryInfoMapper;
    
    public List<CategoryDTO> getAll(){

    	List<CategoryDTO> lCategoryDTOs = new ArrayList<CategoryDTO>();//返回的分层目类
    	List<CategoryDTO> lcd_shi_tmp = new ArrayList<CategoryDTO>();//二级目类暂存
    	List<CategoryDTO> lcd_tmp = categoryDTOMapper.getAll();   //从数据库取所有目类
    	CategoryDTO cd_shen_tmp = new CategoryDTO();
    	for (CategoryDTO categoryInfo : lcd_tmp) {
			if (categoryInfo.getId() % 10000 == 0) {
				cd_shen_tmp = new CategoryDTO();
				BeanUtils.copyPropertiesIgnoreNull(categoryInfo, cd_shen_tmp);
				lcd_shi_tmp = new ArrayList<CategoryDTO>();
				cd_shen_tmp.setSubCategoryList(lcd_shi_tmp);
				lCategoryDTOs.add(cd_shen_tmp); //加一个一级目类
			}else if (categoryInfo.getId() % 100 == 0) {
				lcd_shi_tmp.add(categoryInfo);//加一个二级目类
			}
		}    	
        return lCategoryDTOs;
    }
}
