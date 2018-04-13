package com.abasen.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author abasen
 * @Description: 测试类 2种方式获取配置信息
 * @date 2018-04-10 23:30
 */

@RefreshScope
@RestController
public class TestController {

    @Value("${from}")
    private String from;

    @Autowired
    private Environment env;

    @RequestMapping("/from")
    public String from() {
        System.out.println("<<<<<<<<<<<<<<@Value注解获取配置信息>>>>>>>>>>>>>>>：" + from);
        System.out.println("<<<<<<<<<<<<<<Environment对象获取配置信息>>>>>>>>>>>>>>>：" + env.getProperty("from"));
        return env.getProperty("from");
    }
}
