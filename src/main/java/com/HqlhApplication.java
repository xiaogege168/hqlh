package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.limao")
public class HqlhApplication {

    public static void main(String[] args) {
        SpringApplication.run(HqlhApplication.class, args);
    }
}
