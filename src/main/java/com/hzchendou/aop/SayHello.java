package com.hzchendou.aop;

/**
 * .
 *
 * @author chendou
 * @date 2019/3/15
 */
public class SayHello implements Say {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("hello," + name);
    }
}
