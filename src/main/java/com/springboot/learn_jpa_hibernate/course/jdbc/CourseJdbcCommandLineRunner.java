package com.springboot.learn_jpa_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.learn_jpa_hibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJdbcRepository repository;
	@Override
	public void run(String... args) throws Exception {
		//repository.insert(new Course(1,"Learn Docker","Docker"));
		//repository.insert(new Course(2,"Learn PMP","PMP"));
		//repository.insert(new Course(3,"Learn AWS","AWS"));
		//repository.insert(new Course(4,"Learn Kubectl","KUBE"));
		
		//repository.delete(1);
		
		//System.out.println(repository.findById(2));
		//System.out.println(repository.findById(3));
	}

}
