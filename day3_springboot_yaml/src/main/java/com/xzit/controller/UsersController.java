package com.xzit.controller;

import com.xzit.model.Users;
import jakarta.annotation.Resource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Walker
 * @date 2025/11/1
 * @project springboot_xzit
 */
@RestController
@RequestMapping("/user")
public class UsersController {
    @Resource //自动注入的方式
    private Users users;

    @Resource
    private Environment env;

    @GetMapping
    public Object showYml(){
        return users;
    }

    @GetMapping("/env")
    public Object inv(){
        System.out.println(env.getProperty("sysUser"));
        System.out.println(env.getProperty("age"));
        System.out.println(env.getProperty("money"));
        System.out.println(env.getProperty("birth"));
        System.out.println(env.getProperty("com.xzit.model.users.name"));
        return "hi";
    }
}
