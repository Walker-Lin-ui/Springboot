package com.xzit.model;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author Walker
 * @date 2025/11/1
 * @project springboot_xzit
 */
@Component
@Data
public class Student {
    private String name;
    private int age;
}
