package com.xzit.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Walker
 * @date 2025/10/29
 * @project springboot_xzit
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "学生对象")
public class Student {
    @Schema(description = "学生id",required = true,example = "1")
    private int id;
    @Schema(description = "学生姓名",required = true,example = "张三")
    private String name;
    @Schema(description = "学生性别",required = true,example = "男")
    private String gender;
    @Schema(description = "学生年龄",required = false,example = "22")
    private int age;
}
