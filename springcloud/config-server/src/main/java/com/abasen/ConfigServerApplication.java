package com.abasen;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author abasen
 * @Description: 服务配置主应用程序
 * @date 2018-04-10 22:55
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(ConfigServerApplication.class).web(true).run(args);
    }

}
