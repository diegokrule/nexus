package com.test.nexu.service;

public class SalutServiceImpl implements SalutService{

	public String sayHello(String name) {
		return String.format("Hello %s", name);
	}

}
