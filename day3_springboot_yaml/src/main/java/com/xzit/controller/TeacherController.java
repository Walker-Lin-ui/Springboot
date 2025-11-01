package com.xzit.controller;

import com.xzit.model.Teacher;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Walker
 * @date 2025/11/1
 * @project springboot_xzit
 */
@RestController
@RequestMapping("teacher")
public class TeacherController {
    @Resource
    private Teacher teacher;

    @GetMapping
    public Object test(){
        return teacher;
    }
}
