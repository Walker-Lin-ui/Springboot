package com.xzit.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.xzit.enums.StatusEnum;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("goods")
public class Goods {
    //@TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
    //创建枚举类型
    private StatusEnum status;
}
