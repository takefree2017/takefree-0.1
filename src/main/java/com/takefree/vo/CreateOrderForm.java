package com.takefree.vo;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by gaoxiang on 2017/12/10.
 */
@Data
public class CreateOrderForm {
    @NotNull(message="shareId不能为空")
    private Long shareId;

    @NotEmpty(message="users不能为空")
    private List<Long> users;

}
