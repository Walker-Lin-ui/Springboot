package com.xzit.controller;

import com.xzit.entity.Member;
import com.xzit.service.MemberService;
import jakarta.annotation.Resource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/member")

public class MemberController {

    @Resource
    private MemberService service;
    @Resource
    private RedisTemplate redisTemplate;

    @GetMapping("/{id}")
    public Object getById(@PathVariable int id){
        String key="member:"+id;
        //从缓存中查询数据
        Object member = redisTemplate.opsForValue().get(key);
        //如果没有查到
        if (member==null){
            //从数据库中查询
            System.out.println("查询数据库");
            Member m = service.getById(id);
            //将查询到的结果放回缓存
            redisTemplate.opsForValue().set(key,m);
            return m;
        }else{
            System.out.println("查询缓存数据");
            return member;
        }
    }
}
