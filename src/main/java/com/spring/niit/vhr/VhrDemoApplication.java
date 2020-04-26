package com.spring.niit.vhr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.spring.niit.vhr.mapper")
public class VhrDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VhrDemoApplication.class, args);
    }
}
