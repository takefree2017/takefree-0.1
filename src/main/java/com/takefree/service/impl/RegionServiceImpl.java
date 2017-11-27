package com.takefree.service.impl;

import com.takefree.common.util.BeanUtils;
import com.takefree.dto.mapper.RegionDTOMapper;
import com.takefree.dto.model.RegionDTO;
import com.takefree.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegionServiceImpl implements RegionService{
    @Autowired
    private RegionDTOMapper regionDTOMapper;
 
    public List<RegionDTO> getAll(){

    	List<RegionDTO> lRegionDTOs = new ArrayList<RegionDTO>();//返回的分层目类
    	List<RegionDTO> lcd_shi_tmp = new ArrayList<RegionDTO>();//二级目类暂存
    	List<RegionDTO> lcd_tmp = regionDTOMapper.getAll();   //从数据库取所有目类
    	RegionDTO cd_shen_tmp = new RegionDTO();
    	for (RegionDTO regionInfo : lcd_tmp) {
			if (regionInfo.getId() % 10000 == 0) {
				cd_shen_tmp = new RegionDTO();
				BeanUtils.copyPropertiesIgnoreNull(regionInfo, cd_shen_tmp);
				lcd_shi_tmp = new ArrayList<RegionDTO>();
				cd_shen_tmp.setSubRegionList(lcd_shi_tmp);
				lRegionDTOs.add(cd_shen_tmp); //加一个一级目类
			}else if (regionInfo.getParentRegionId().equals(cd_shen_tmp.getId() )) {
				lcd_shi_tmp.add(regionInfo);//加一个二级目类
			}
		}    	
        return lRegionDTOs;
    }
 
}
