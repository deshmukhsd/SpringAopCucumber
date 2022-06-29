package org.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class CucAspect {

    @Around("within(org.example..*)")
    public void before(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long startTime=System.currentTimeMillis();
        proceedingJoinPoint.proceed();
        long endTime=System.currentTimeMillis();
        System.out.println("Execution Time for method @"+proceedingJoinPoint.getSignature().getName()+" is "+(endTime-startTime)+" milliSeconds");
    }

}
