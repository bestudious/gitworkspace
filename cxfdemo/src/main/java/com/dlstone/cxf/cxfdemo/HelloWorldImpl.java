package com.dlstone.cxf.cxfdemo;

import javax.jws.WebService;

@WebService(endpointInterface="com.dlstone.cxf.cxfdemo.HelloWorld",
serviceName="HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayHi(String text) {
		
		return "Hi + " + text;
	}

}
