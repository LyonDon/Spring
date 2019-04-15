package com.IOC;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

//	public MyBeanPostProcessor() {
//		super();
//		System.out.println("这是BeanPostProcessor实现类构造器！！");
//	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("["+this.getClass().getName()+"]实例化结束"+beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("["+this.getClass().getName()+"]开始实例化"+beanName);

		return bean;
	}
}