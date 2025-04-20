package com.guicai.guipicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.guicai.guipicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)

public class GuiPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuiPictureBackendApplication.class, args);
    }

}
