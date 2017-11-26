package com.takefree.dto.model;

import lombok.Data;
import java.io.Serializable;
import java.util.List;

@Data
public class CategoryDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * @mbg.generated
     */
    private Long id;

    /**
     * 类目名称
     * @mbg.generated
     */
    private String categoryName;

    /**
     * 层级, 10第一层; 20第二层
     * @mbg.generated
     */
    private Byte layer;

    /**
     * 父层级的category_id
     * @mbg.generated
     */
    private Long parentCategoryId;

    private List<CategoryDTO> subCategoryList;
}
