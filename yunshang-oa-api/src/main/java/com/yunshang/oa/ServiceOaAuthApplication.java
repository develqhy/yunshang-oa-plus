package com.yunshang.oa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.yunshang.oa.mapper")
public class ServiceOaAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceOaAuthApplication.class, args);
    }

}
