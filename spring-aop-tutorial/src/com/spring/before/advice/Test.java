package com.spring.before.advice;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Test{  
    public static void main(String[] args){  
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/before/advice/beans/applicationContextbefore.xml");  
        Operation e = (Operation) context.getBean("opBean");  
        System.out.println("calling msg method...");  
        e.msg();  
        System.out.println("calling m method...");  
        e.m();  
        System.out.println("calling k method...");  
        e.k();  
        ((ClassPathXmlApplicationContext)context).close();
     
    }  
}  