package com.spring.before.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;  
import org.aspectj.lang.annotation.Before;  
import org.aspectj.lang.annotation.Pointcut;  
  
@Aspect  
public class TrackOperation{  
   // @Pointcut("execution(* Operation.*(..))") //point cut expression invoke all method in operation class
	@Pointcut("execution(* Operation.m*(..))")  //point cut expression only for those methods that starts with m 
    public void k(){}//pointcut name  
      
    @Before("k()")//applying pointcut on before advice 
    @After("k()")//applying pointcut on before advice 
    public void myadvice(JoinPoint jp)//it is advice (before advice)  
    {  
        System.out.println("additional concern");  
        //System.out.println("Method Signature: "  + jp.getSignature());  
    }  
}  