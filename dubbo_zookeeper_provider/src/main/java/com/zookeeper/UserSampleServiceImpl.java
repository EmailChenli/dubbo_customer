package com.zookeeper;


import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * Administrator
 * 2021/9/7 0007
 */
@Service(interfaceClass = Inter.class)
@Component
public class UserSampleServiceImpl implements Inter {
    @Override
    public String hello(String message) {
        return "String Provider:"+message;
    }
}
