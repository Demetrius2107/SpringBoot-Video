package com.hua.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_setting")
public class Setting implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    //审核策略
    private String auditPolicy;

    //热门视频热度限制
    private Double hotLimit;

    //审核开关
    private Boolean auditOpen;

    //资源放行ip
    private String allowIp;

    private Boolean auth;

    @TableField(exist = false)
    private SettingScoreJson settingScoreJson;
}
