package com.javagyojin.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String atx = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(atx); 
		//컨테이너 객체를 ApplicationConfig 클래스로 설정하여 생성
		
		Student student1 = ctx.getBean("student1",Student.class);
		Student student2 = ctx.getBean("student2",Student.class);
		Student student3 = ctx.getBean("student3",Student.class);
		
		System.out.println(student1.getName());//홍길동
		System.out.println(student2.getName());//이순신
		System.out.println(student3.getName());//김유신
		
		ctx.close();
		
		
		
	}

}
