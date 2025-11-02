package com.xzit.entity;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;


@Data
@Schema(description = "学生对象")
public class Student {
    @Schema(description = "学生id")
    private Integer id;
    @Schema(description = "学生姓名")
    private String name;
    @Schema(description = "学生性别")
    private String gender;
    @Schema(description = "学生年龄")
    private Integer age;
}
