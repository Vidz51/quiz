package com.blog.app.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,Long> {

	public List<Course> findByTopicId(Long topicId);
	
	public List<Course> findByName(String name); //spring jpa implementation to find a course by name
	public List<Course> findByDescription(String description);
}
