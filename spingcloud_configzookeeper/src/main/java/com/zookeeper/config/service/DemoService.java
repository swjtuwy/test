package com.zookeeper.config.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class DemoService {
    @Value("${msg:defaultMsg}")
    private String msg;

    @Value("${first.second:tree}")
    private String tree;


    public String getMsg() {
        return "Hello " + this.msg + " " + this.tree;
    }
}
