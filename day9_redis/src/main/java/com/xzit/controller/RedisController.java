package com.xzit.controller;

import jakarta.annotation.Resource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class RedisController {
    @Resource
    private RedisTemplate redisTemplate;//可以修改序列化实现类
    //private StringRedisTemplate stringRedisTemplate;
    @GetMapping("/{key}")
    public Object get(@PathVariable String key){
        Object o = redisTemplate.opsForValue().get(key);
        return o;
    }
    @PostMapping("/{key}/{value}")
    public Object set(@PathVariable String key,@PathVariable String value){
        redisTemplate.opsForValue().set(key,value);
        return "ok";
    }
}
