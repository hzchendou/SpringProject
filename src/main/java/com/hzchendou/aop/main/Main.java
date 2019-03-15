package com.hzchendou.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hzchendou.aop.Say;

/**
 * .
 *
 * @author chendou
 * @date 2019/3/15
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("application.xml");
        Say say =(Say)context.getBean("say");
        say.say();
    }
}
