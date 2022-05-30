package com.exceedy.dubbotest.provider.service.impl;

import com.exceedy.dubbotest.dubbotestinterface.service.SayHello;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * @author exccedy
 * @date 2022/5/29
 **/
@Service
@DubboService
public class SayHelloImpl implements SayHello {

    @Override
    public String sayHello(String name) {
        System.out.println("Hello, " + name);
        return "Hello, " + name;
    }
}
