package com.ajpeng.microserver.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

@SpringBootApplication
@ImportResource({"classpath:spring-dubbo.xml"})
@MapperScan("com.ajpeng.microserver.provider.mapper")
public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(ProviderApplication.class, args);
        System.out.println("服务端启动成功！！！");
        System.in.read();
    }
}
