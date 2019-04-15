package com.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctxApplicationContext=
				new ClassPathXmlApplicationContext("com/IOC/IOC.xml");
		JuiceMaker juiceMaker=(JuiceMaker) ctxApplicationContext.getBean("juiceMaker");
		String resString=juiceMaker.makeJuice();
		System.out.println(resString);
		
		ClassPathXmlApplicationContext ctxApplicationContext2=
				new ClassPathXmlApplicationContext("com/IOC/IOC.xml");
		JuiceMaker juiceMaker2=(JuiceMaker) ctxApplicationContext2.getBean("juiceMaker2");
		String resString2=juiceMaker2.makeJuice2();
		System.out.println(resString2);
		ctxApplicationContext.close();
		ctxApplicationContext2.close();
	}
}
