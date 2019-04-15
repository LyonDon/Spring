package com.IOC;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class JuiceMaker implements BeanNameAware,BeanFactoryAware,
		ApplicationContextAware,InitializingBean,DisposableBean{
	
	private String factory;
	private String beverageShop;
	private Source source;
	private Source source2;
	
	public Source getSource2() {
		return source2;
	}

	public void setSource2(Source source2) {
		this.source2 = source2;
	}

	public String getFactory() {
		return factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public String getBeverageShop() {
		return beverageShop;
	}

	public void setBeverageShop(String beverageShop) {
		this.beverageShop = beverageShop;
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}
	
	public String makeJuice() {
		String juice="这是一杯由"+factory+"产出的"+beverageShop+"饮品店制作的"+source.getSugar()+source.getSize()+source.getFruit();
		String juice2="这是一杯由"+factory+"产出的"+beverageShop+"饮品店制作的"+source.getSugar()+source.getSize()+source.getFruit();
		return juice+"\n"+juice2;
	}
	public String makeJuice2() {
		String juice3="这是一杯由"+factory+"产出的"+beverageShop+"饮品店制作的"+source2.getSugar()+source2.getSize()+source2.getFruit();
		String juice4="这是一杯由"+factory+"产出的"+beverageShop+"饮品店制作的"+source2.getSugar()+source2.getSize()+source2.getFruit();
		return juice3+"\n"+juice4;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("调用接口disposableBean的distroy方法");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("["+this.getClass().getSimpleName()+"]调用InitializingBean的afterPropertiesSet方法");
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("["+this.getClass().getSimpleName()+"]调用ApplicationContextAwear的setApplicationContext方法");
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("["+this.getClass().getSimpleName()+"]调用BeanFactoryAware的setBeanFactory方法");
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("["+this.getClass().getSimpleName()+"]调用BeanNameAware的setBeanName方法");
	}
	
	public void init() {
		System.out.println("["+this.getClass().getSimpleName()+"]执行自定义初始化方法");
	}
	
	public void myDestory() {
		System.out.println("["+this.getClass().getSimpleName()+"]执行自定义销毁方法");
	}
}
