package com.xzit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Walker
 * @date 2025/10/28
 * @project springboot_xzit
 */
@RestController
public class TeacherController {
    @GetMapping("/teacher")
    public String index(){
        return "hello spring boot 3";
    }
}
