package com.xzit.mybatisX.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName com_dept
 */
@TableName(value ="com_dept")
@Data
public class Dept {
    /**
     * 
     */
    @TableId
    private Long id;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 部门地址
     */
    private String local;

    private Integer createYear;
}