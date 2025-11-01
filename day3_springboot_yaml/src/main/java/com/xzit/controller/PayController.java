package com.xzit.controller;

import com.xzit.pay.PayMent;
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
@RequestMapping("pay")
public class PayController {
    @Resource
    private PayMent payMent;

    @GetMapping
    public Object pay(){
        payMent.pay();
        return "ok";
    }
}
