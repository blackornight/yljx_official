package com.yljx.official;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * spring启动入口
 * @author yangpeng
 * Created by yangpeng on 2017/12/4.
 */
@SpringBootApplication
@ComponentScan
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
