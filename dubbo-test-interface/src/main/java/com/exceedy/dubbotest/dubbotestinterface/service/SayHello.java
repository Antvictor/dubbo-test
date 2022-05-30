package com.exceedy.dubbotest.dubbotestinterface.service;

/**
 * @author exccedy
 * @date 2022/5/29
 **/
public interface SayHello {
    /**
     * 打招呼
     * @param name 名字
     * @return 名字
     */
    public String sayHello(String name);
}
