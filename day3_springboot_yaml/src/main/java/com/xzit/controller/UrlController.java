package com.xzit.controller;

import com.xzit.model.UrlModel;
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
@RequestMapping("url")
public class UrlController {
    @Resource
    private UrlModel urlModel;

    @GetMapping
    public Object testUrl(){
        return urlModel;
    }
}
