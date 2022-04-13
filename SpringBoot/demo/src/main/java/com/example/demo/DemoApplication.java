package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.bean.Laptop;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext c=SpringApplication.run(DemoApplication.class, args);
		Laptop l=c.getBean(Laptop.class);
		l.show();
	}

}
