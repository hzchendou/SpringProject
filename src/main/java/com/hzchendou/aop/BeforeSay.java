package com.hzchendou.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * .
 *
 * @author chendou
 * @date 2019/3/15
 */
public class BeforeSay implements MethodInterceptor {

    public void beforesay(){
        System.out.println("说之前");
    }

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        beforesay();
        return methodInvocation.proceed();
    }
}
