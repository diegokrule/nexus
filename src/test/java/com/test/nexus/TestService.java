package com.test.nexus;

import com.test.nexu.service.SalutService;
import com.test.nexu.service.SalutServiceImpl;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestService {
	
	@Test
	public void testHelloService() {
		SalutService ss=new SalutServiceImpl();
		String resp=ss.sayHello("w.w. You are the danger");
		assertEquals("Hello w.w. You are the danger", resp);
	}

}
