package com.seed.aop.adm.gvinci;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.seed.aop.adm.gvinci.ExampleController.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Request received for: " + joinPoint.getSignature().toShortString());
    }

    @AfterReturning(pointcut = "execution(* com.seed.aop.adm.gvinci.ExampleController.*(..))", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("Response sent from: " + joinPoint.getSignature().toShortString());
        System.out.println("Response: " + result);
    }
}