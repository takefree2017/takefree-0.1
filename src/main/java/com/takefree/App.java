package com.takefree;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.takefree.dao")//告诉mapper所在的包名
public class App {
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
