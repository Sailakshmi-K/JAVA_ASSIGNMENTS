package com.example.demo.bean;

import org.springframework.stereotype.Component;

@Component
public class Hitachi implements HardDisk{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String details() {
		// TODO Auto-generated method stub
		return "Hitachi Hard Disk";
	}


}
