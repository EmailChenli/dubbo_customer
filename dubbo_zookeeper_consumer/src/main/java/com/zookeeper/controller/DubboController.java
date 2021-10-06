package com.zookeeper.controller;

import com.zookeeper.client.DubboUserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Administrator
 * 2021/10/6 0006
 */
@RestController
public class DubboController {
    @Autowired
    private DubboUserClient dubboUserClient;
    @GetMapping("/getuser")
    public String getUser(){
        return dubboUserClient.getNum(1L);
    }
}
