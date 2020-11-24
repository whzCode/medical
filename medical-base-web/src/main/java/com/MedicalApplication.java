package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author 卫宏哲
 * @Date 2020/11/23 21:02
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.whz.system.mapper")
@EnableSwagger2
public class MedicalApplication {
    public static void main(String[] args) {
        SpringApplication.run(MedicalApplication.class,args);
    }
}
