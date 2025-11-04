package com.xzit.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("teacher")
public class Teacher {
    @TableId(type = IdType.AUTO)//遵循数据库自增
    private Integer id;
    //@TableField(value = "teacher_name")
    private String TeacherName;
    private String gender;
    @TableField(select = false)//这个字段查询不返回值
    private Integer age;
    @TableField(exist = false)//标明：这个字段在数据库中不存在
    private String addr;
    //@TableLogic
    private Integer deleted;
}
