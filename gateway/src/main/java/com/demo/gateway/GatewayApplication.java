package com.demo.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/** 
* 网关服务启动类 
* 所有前端请求先经过网关，再转发到对应业务服务 
*/
@SpringBootApplication // 项目启动核心注解
@EnableDiscoveryClient // 注册到Nacos

public class GatewayApplication {

public static void main(String[] args) {

SpringApplication.run(GatewayApplication.class, args);
 
}
}