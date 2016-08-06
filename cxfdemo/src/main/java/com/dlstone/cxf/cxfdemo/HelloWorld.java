package com.dlstone.cxf.cxfdemo;

import javax.jws.WebService;

@WebService
public interface HelloWorld {

	public String sayHi(String text);

}
