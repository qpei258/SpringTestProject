package com.coderby.myapp.di;

public class HelloController {
	IHelloService helloService;
	
//	public HelloController(IHelloService helloService) {
//		this.helloService = helloService;
//	}


	public void hello(String name) {
		System.out.println("HelloController: " + helloService.sayHello(name));
	}

	public void setHelloService(IHelloService helloService) {
		this.helloService = helloService;
	}
}
