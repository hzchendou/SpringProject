package com.hzchendou.aop;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.core.Ordered;


/**
 * .
 *
 * @author chendou
 * @date 2019/3/15
 */
public class AfterSay implements MethodInterceptor, Ordered {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object val = methodInvocation.proceed();
        System.out.println("AfterSay说之后");
        return val;
    }

    @Override
    public int getOrder() {
        return 3;
    }
}
