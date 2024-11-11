package com.Injections.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		Develop1 obj1=context.getBean(Develop1.class);
		Develop2 obj2=context.getBean(Develop2.class);
		Develop3 obj3=context.getBean(Develop3.class);
		obj1.build();
		obj2.build();
		obj3.build();
	}

}
