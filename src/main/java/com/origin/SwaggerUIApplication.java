package com.origin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan(basePackages = "com.origin")//扫描common下的所有类
@EntityScan("com.origin")
public class SwaggerUIApplication {
    public static void main(String[] args) {
        SpringApplication.run(SwaggerUIApplication.class, args);
    }

}
