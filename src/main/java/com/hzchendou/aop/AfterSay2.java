package com.hzchendou.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.core.Ordered;

/**
 * .
 *
 * @author chendou
 * @date 2019/3/15
 */
public class AfterSay2 implements MethodInterceptor, Ordered {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object val = methodInvocation.proceed();
        System.out.println("AfterSay2说之后");
        return val;
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
