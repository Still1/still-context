package com.still.stillframework.testdependencies;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class SpringDemoTest {
	@Test
	public void testOutput() {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringDemoTest.class);
		SpringDemo springDemo = context.getBean(SpringDemo.class);
		Integer output = springDemo.output();
		Assert.assertTrue(output == 1);
	}
}
