package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.bean.Student;

@SpringBootApplication
public class StudentSbApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext c =SpringApplication.run(StudentSbApplication.class, args);
		Student s=c.getBean(Student.class);
		System.out.println("********STUDENT DETAILS************");
		System.out.println(s);
	}
}
