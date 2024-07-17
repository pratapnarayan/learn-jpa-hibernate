package com.springboot.learn_jpa_hibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.learn_jpa_hibernate.course.Course;
import com.springboot.learn_jpa_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

	//@Autowired
	//private CourseJpaRepository repository;
	
	@Autowired
	CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		//repository.insert(new Course(1,"Learn Docker JPA","Docker"));
		//repository.insert(new Course(2,"Learn PMP JPA","PMP"));
		//repository.insert(new Course(3,"Learn AWS JPA","AWS"));
		//repository.insert(new Course(4,"Learn Kubectl JPA","KUBE"));
		
		//repository.deleteById(1);
		
		//System.out.println(repository.findById(2));
		//System.out.println(repository.findById(3));
		
		//Using Spring Data JPA
		
		repository.save(new Course(1,"Learn Docker Spring Data JPA","Docker"));
		repository.save(new Course(2,"Learn PMP Spring Data JPA","PMP"));
		repository.save(new Course(3,"Learn AWS Spring Data JPA","AWS"));
		repository.save(new Course(4,"Learn Kubectl Spring Data JPA","KUBE"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
	}

}
