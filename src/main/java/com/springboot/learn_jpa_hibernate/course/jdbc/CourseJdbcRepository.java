package com.springboot.learn_jpa_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.learn_jpa_hibernate.course.Course;

@Repository
public class CourseJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	//Insert query with Hardcoded values
	private static String INSERT_QUERY = 
			"""
				insert into course (id,name,author)
				values(1,'Learn AWS', 'AWS');
			
			""";
	//Insert query with Parameters
	private static String INSERT_QUERY_PARAMETER = 
			"""
				insert into course (id,name,author)
				values(?,?,?);
			""";
	private static String DELETE_QUERY_PARAMETER = 
			"""
				delete from course where id = ?;
			""";
	private static String SELECT_QUERY_PARAMETER = 
			"""
				select * from course where id = ?;
			""";
	/*
	public void  insert() {
		//Hardcoded values
		springJdbcTemplate.update(INSERT_QUERY);
		
	}
	*/
	public void  insert(Course course) {
		//With parameter
		springJdbcTemplate.update(INSERT_QUERY_PARAMETER, course.getId(),course.getName(),course.getAuthor());
	}
	
	public void  delete(long id) {
		//With parameter
		springJdbcTemplate.update(DELETE_QUERY_PARAMETER, id);
	}
	
	public Course  findById(long id) {
		//With parameter
		return springJdbcTemplate.queryForObject(SELECT_QUERY_PARAMETER, new BeanPropertyRowMapper<>(Course.class),id);
	}

}
