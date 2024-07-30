package com.it.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @Autowired
    StringRedisTemplate redisTemplate;

    @GetMapping("/haha")
    public String Hello(){
        return "Hello";
    }

    @GetMapping("/incr")
    public String incr(){
        Long hh = redisTemplate.opsForValue().increment("hh");
        return "增加后的值" + hh;
    }
}










