package com.demo.userservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 用户微服务启动类
 * @author zouj
 * 所有SpringBoot项目必有有一个启动类，启动类上必须有@SpringBootApplication注解
*/


// 核心注解1：SpringBoot项目启动核心，自动配置Spring容器，扫描当前包及子包下的所有组件，注册到Spring容器中
@SpringBootApplication
// 核心注解2：开启微服务注册发现，将当前服务注册到Nacos注册中心，供其他微服务调用
@EnableDiscoveryClient
// 核心注解3：扫描指定包下的Mapper接口，生成代理对象，注册到Spring容器中
@MapperScan("com.demo.userservice.mapper")
public class UserServiceApplication {
    public static void main(String[] args) {
        // 启动SpringBoot项目，启动Spring容器，启动内嵌的Tomcat服务器,加载所有配置、依赖、代码
        SpringApplication.run(UserServiceApplication.class, args);
    }
}
