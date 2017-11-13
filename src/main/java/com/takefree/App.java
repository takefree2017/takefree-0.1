package com.takefree;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.takefree.dao")//告诉mapper所在的包名
@ComponentScan("com.takefree.*")
public class App {
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
