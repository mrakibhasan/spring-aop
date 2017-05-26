package com.spring.around.advice;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Test{  
    public static void main(String[] args){  
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/around/advice/bean/applicationContextAround.xml");  
          
        Operation op = (Operation) context.getBean("opBean");  
        op.msg();  
        op.display();  
        ((ClassPathXmlApplicationContext)context).close();
    }  
}   