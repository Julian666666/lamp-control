package com.lingtu.lampcontrol.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * Table: ctl_loop
 */
@Data
public class CtlLoop implements Serializable {
    /**
     * 编号主键
     *
     * Table:     ctl_loop
     * Column:    loop_id
     * Nullable:  false
     */
    private Long loopId;

    /**
     * 控制器编号
     *
     * Table:     ctl_loop
     * Column:    loop_code
     * Nullable:  true
     */
    private String loopCode;

    /**
     * 控制器名称
     *
     * Table:     ctl_loop
     * Column:    loop_name
     * Nullable:  true
     */
    private String loopName;

    /**
     * 供应商名称
     *
     * Table:     ctl_loop
     * Column:    suppliers
     * Nullable:  true
     */
    private String suppliers;

    /**
     * 记录创建时间
     *
     * Table:     ctl_loop
     * Column:    create_time
     * Nullable:  true
     */
    private Date createTime;

    /**
     * 记录最后一次修改时间
     *
     * Table:     ctl_loop
     * Column:    update_time
     * Nullable:  true
     */
    private Date updateTime;

    /**
     * 回收状态（0未回收  1已回收）
     *
     * Table:     ctl_loop
     * Column:    recycle
     * Nullable:  true
     */
    private String recycle;

    /**
     * 此控制器是否被使用,1为弃用，0为使用  2为添加
     *
     * Table:     ctl_loop
     * Column:    status
     * Nullable:  true
     */
    private String status;

    /**
     * 备注
     *
     * Table:     ctl_loop
     * Column:    remark
     * Nullable:  true
     */
    private String remark;

    private static final long serialVersionUID = 1L;
}