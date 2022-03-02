package com.priya.jpa.hibernate.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.priya.jpa.hibernate.demo.entity.Course;

import jakarta.persistence.EntityManager;
@Repository
public class CourseRepository {
	@Autowired
	EntityManager entityManager;
//	@PersistenceContext
//	EntityManager entityManager;

	//public Course findById(Long id)
	//public Course save(Course course) --> insert or update
	//public void deleteById(Long id) --n> delete by using id
	
	public Course findById(Long id) {
		return entityManager.find(Course.class, id);
	}
	
	
}
