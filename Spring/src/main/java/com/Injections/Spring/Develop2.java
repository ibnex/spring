package com.Injections.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Develop2 {
	@Autowired
	private Laptop laptop;
	public void build() {
		laptop.compile();
		System.out.println("It is working");
	}
}
