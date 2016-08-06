package com.dlstone.cxf.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dlstone.cxf.cxfdemo.HelloWorld;

public class Client {

	public static void main(String[] args) throws Exception {
/*		//第一种 需要知道具体的方法
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setAddress("http://localhost:9000/firstServer");
		factory.setServiceClass(HelloWorld.class);
		HelloWorld service = (HelloWorld) factory.create(); 
		System.out.println(service.sayHi("dlstone"));*/
		
		/*//第二种 直接根据http://localhost:9000/firstServer?wsdl（即文件的位置）通过反射访问
		JaxWsDynamicClientFactory clientFactory = 
				JaxWsDynamicClientFactory.newInstance();
		org.apache.cxf.endpoint.Client client = 
				clientFactory.createClient("http://localhost:9000/firstServer?wsdl");
		Object[] result = client.invoke("sayHi", "dlstone");
		for (Object o : result) {
			System.out.println(o);
		}*/
		
		/*发布在Tomcat中*/
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] {"client-beans.xml"});
		HelloWorld client = (HelloWorld)context.getBean("client");
		System.out.println(client.sayHi("dlstone"));
	}

}
