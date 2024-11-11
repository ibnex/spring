package com.Injections.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Develop3 {
	private Laptop laptop;
	@Autowired
	public void setlaptop(Laptop laptop) {
		this.laptop=laptop;
	}
	public void build() {
		laptop.compile();
		System.out.println("It is Working");
	}
}
