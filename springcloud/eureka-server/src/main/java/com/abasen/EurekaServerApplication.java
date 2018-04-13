package com.abasen;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author abasen
 * @Description: 服务注册中心 应用主类
 * @date 2018-03-31 16:41
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
    }
}
