package com.takefree.dto.mapper;

import com.takefree.dto.model.RegionDTO;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
@Repository
@Mapper
public interface RegionDTOMapper {
	List<RegionDTO> getAll();
}
