package com.sp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sp.mapper")
public class JpjApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpjApplication.class, args);
    }

}
