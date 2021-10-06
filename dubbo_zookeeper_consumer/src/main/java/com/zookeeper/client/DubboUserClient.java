package com.zookeeper.client;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zookeeper.Inter;
import org.springframework.stereotype.Component;

/**
 * Administrator
 * 2021/10/6 0006
 */
@Component
public class DubboUserClient {
    @Reference(check=false)
    private Inter dubboUserServer;
    public String getNum(Long id){
        return dubboUserServer.hello("name")+id;
    }
}
