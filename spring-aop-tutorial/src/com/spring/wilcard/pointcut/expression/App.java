package com.spring.wilcard.pointcut.expression;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.wilcard.pointcut.expression.accessories.Lens;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/wilcard/pointcut/expression/beans.xml");
	
		Camera camera = (Camera)context.getBean("camera");
		Lens lens = (Lens)context.getBean("lens");
		
		camera.snap();
		camera.snap(1000);
		camera.snap("Prague castle");
		camera.snapNighttime();
		
		lens.zoom(5);
		
		context.close();
	}

}
