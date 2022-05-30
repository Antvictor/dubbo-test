package com.exceedy.dubbotest.consumers;

import com.exceedy.dubbotest.dubbotestinterface.service.SayHello;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConsumersApplication {

    @DubboReference
    SayHello sayHello;

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ConsumersApplication.class, args);
        ConsumersApplication bean = run.getBean(ConsumersApplication.class);
        String result = bean.doSayHi("张三");
        System.out.println(result);

    }

    public String doSayHi(String name) {
        return sayHello.sayHello(name);
    }

}
