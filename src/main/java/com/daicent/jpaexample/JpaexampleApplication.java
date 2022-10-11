package com.daicent.jpaexample;

import com.daicent.jpaexample.model.Student;
import com.daicent.jpaexample.service.SchoolService;
import com.daicent.jpaexample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@SpringBootApplication
public class JpaexampleApplication implements CommandLineRunner {

	@Autowired
	private SchoolService schoolService;

	@Autowired
	private StudentService studentService;


	public static void main(String[] args) {
		SpringApplication.run(JpaexampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("Hello World");
		System.out.println(studentService.findAll());
	}
}
