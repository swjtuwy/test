package com.zookeeper.config.controller;


import com.zookeeper.config.service.ArchaiusZkConfig;
import com.zookeeper.config.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@RefreshScope
public class DemoController {

    @Autowired
    DemoService demoService;

    @Autowired
    ArchaiusZkConfig archaiusZkConfig;

    @RequestMapping("/msg")
    String getMsgFromConfig(){
        return demoService.getMsg();
    }

    @RequestMapping("/msg2")
    String getMsgDynamic(){
        return archaiusZkConfig.getDynamicUpdate();
    }
}
