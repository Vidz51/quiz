package com.blog.app.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	

	public List<Course> getAllCourses(Long id){
		
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(id)
		.forEach(courses ::add);
		
		return courses;
	}
	public Course getCourse(Long id){
		return courseRepository.findOne(id);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	public void updateCourse(Course course) {
		courseRepository.save(course);
		
	}
	public void deleteCourse(Long id) {
		courseRepository.delete(id);
		
	}
}