package com.it.boot;

import com.it.boot.bean.Pig;
import com.it.boot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//springboot只会扫描主程序所在的包及其子包
//com/it/boot
//com/it/boot/controller/
@SpringBootApplication(scanBasePackages = "com.it")
public class Boot302DemoApplication {

    public static void main(String[] args) {
        //局部变量类型的自动推断
        var ioc = SpringApplication.run(Boot302DemoApplication.class, args);

        //1.获取容器中所有组件的名字
        String[] names = ioc.getBeanDefinitionNames();
        //2.挨个遍历
        for (String name : names) {
            System.out.println(name);
        }
        for (String s : ioc.getBeanNamesForType(User.class)) {
            System.out.println(s);
        }
        Pig bean = ioc.getBean(Pig.class);
        System.out.println(bean.getId() + bean.getName());
    }
}





















