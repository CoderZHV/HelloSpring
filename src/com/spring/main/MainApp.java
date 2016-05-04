package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.domain.HelloWorld;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
		
		HelloWorld tx = (HelloWorld) con.getBean("helloWorld");
		
		tx.getMessage();
	}
	
}
