package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	@Autowired
	HardDisk hd;

	public void show() {
		System.out.println("This is laptop class");
		System.out.println("Details of Hard Disk are : "+hd.details());
	}

}
