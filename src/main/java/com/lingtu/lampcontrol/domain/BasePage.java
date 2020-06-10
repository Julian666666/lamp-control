package com.lingtu.lampcontrol.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 马帅
 * @version 1.0
 * @className BasePage.java
 * @description 通用分页实体，迎合layUI分页请求参数
 * @date 2020/2/23 17:49
 */
@Data
public abstract class BasePage implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 页数 **/
    private Integer page;

    /** 条数 **/
    private Integer limit;

    /** 创建者 **/
    private String creator;

    /** 更新者 **/
    private String updater;
}
