package com.it.boot.Config;

import com.it.boot.bean.Cat;
import com.it.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.alibaba.druid.FastsqlException;

@Configuration
public class Appconfig2 {

    @ConditionalOnClass(name = "com.alibaba.druid.FastsqlException")
    @Bean
    public Cat cat01(){
        return new Cat();
    }

    @ConditionalOnMissingClass(value = "xxx")
    @Bean
    public User user01(){
        return new User();
    }
}
