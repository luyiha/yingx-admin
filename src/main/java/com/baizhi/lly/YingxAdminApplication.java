package com.baizhi.lly;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.baizhi.lly.dao")
public class YingxAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(YingxAdminApplication.class, args);
    }

}
