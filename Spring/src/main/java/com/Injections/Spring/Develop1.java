package com.Injections.Spring;

import org.springframework.stereotype.Component;

@Component
public class Develop1 {
	private Laptop laptop;
	public  Develop1(Laptop laptop) {
		this.laptop=laptop;
	}
	public void build() {
		laptop.compile();
		System.out.println("It is Working");
	}
}
