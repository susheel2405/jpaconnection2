package com.noeteric.jpa.jpademo.jpaconnection2.springioc;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Pointcut("execution(* com.noeteric.jpa.jpademo.jpaconnection2.springioc.*.*(..))")
    private void publicMethodsFromLoggingPackage() {
    }

    @Around("publicMethodsFromLoggingPackage()")
    public Object logging(ProceedingJoinPoint joinPoint) throws Throwable{
        String methodName = joinPoint.getSignature().getName();
        long startTimeInmills = System.currentTimeMillis();
        System.out.println(" Enter into    "+methodName+"   method");

        Object[] args = joinPoint.getArgs();

        Object result =  joinPoint.proceed();


        long endTimeInmills = System.currentTimeMillis();
        System.out.println(" Exit from  "+ methodName +"   method timeTaken"+ (endTimeInmills-startTimeInmills));
        return result;
    }
}
