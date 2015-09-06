package com.mkyong.common.SpringExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");
		HelloWorld obj = (HelloWorld) applicationContext.getBean("helloBean");
		obj.printHello();
		
//		IOutputGenerator output = new CsvOutputGenerator();
//    	output.generateOutput();
    	

    	OutputHelper output = (OutputHelper)applicationContext.getBean("outputHelper");
    	output.generateOutput();
	}
}
