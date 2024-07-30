package com.it.boot.Config;

import com.it.boot.bean.Cat;
import com.it.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//这是一个配置类，替代以前的配置文件，配置类本身也是容器中的组件
public class Appconfig {
//    @Bean//替代以前的bean标签，组件在容器中的名字默认是方法名
//    public User user(){
//        var user = new User();
//        user.setId("10");
//        user.setName("张三");
//        return user;
//    }
    @Bean
    public Cat cat(){
        var cat = new Cat();
        cat.setId("5");
        cat.setName("Tom");
        return cat;
    }
}
