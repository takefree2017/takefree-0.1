package com.takefree.dto.model;

import com.fasterxml.jackson.annotation.JsonView;
import com.takefree.common.entry.ResultView;
import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class RegionDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * @mbg.generated
     */
    private Long id;

    /**
     * 地区名称
     * @mbg.generated
     */
    private String regionName;

    /**
     * 层级, 10第一层; 20第二层
     * @mbg.generated
     */
    private Byte layer;

    /**
     * 父层级的region_id
     * @mbg.generated
     */
    private Long parentRegionId;


    private List<RegionDTO> subRegionList;
}
