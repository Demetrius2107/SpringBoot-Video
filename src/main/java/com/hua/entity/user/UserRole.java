package com.hua.entity.user;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserRole   implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value =  "id",type = IdType.AUTO)
    private Long id;

    private Long roleId;

    private Long userId;
}
