package com.dlstone.cxf.cxfdemo;

import org.apache.cxf.frontend.ServerFactoryBean;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Server {

	public static void main(String[] args) throws InterruptedException {
		//第一种方式，jax-ws
	/*	HelloWorld hello = new HelloWorldImpl();
		String address = "http://localhost:9000/firstServer";
		Endpoint.publish(address, hello);*/
		
		//第二种，CXF方式
		/*String address = "http://localhost:9000/firstServer";
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		factory.setAddress(address);
		factory.setServiceClass(HelloWorld.class);
		//这种需要新建一个javaBean的实例
		factory.setServiceBean(new HelloWorldImpl());
		factory.create();*/
		
		//第三种，CXF简单方式 这个方法不需要在类中注解，直接普通类就行
		String address = "http://localhost:9000/firstServer";
		ServerFactoryBean factory = new ServerFactoryBean();
		factory.setAddress(address);
		factory.setServiceClass(HelloWorld.class);
		factory.setServiceBean(new HelloWorldImpl());
		factory.create();
		
		System.out.println("service start!");
		Thread.sleep(5 * 60 * 1000);
		System.out.println("Server exiting");
	}

}
