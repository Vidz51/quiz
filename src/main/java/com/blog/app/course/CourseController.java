package com.blog.app.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.app.topic.Topic;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourse(@PathVariable Long id) {
		
		return courseService.getAllCourses(id);
				}
	/*
	 * spring mvc converts this list of courses into json. jason has key valu
	 * struture so key are property names and values are value of these
	 * properties
	 */
	
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable Long id){
		return courseService.getCourse(id);
		
	}
	
	@PostMapping(value="/topics/{topicId}/courses")
	public String addCourse(@RequestBody Course course, @PathVariable Long topicId){
		course.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(course);
		return null;
		
	}
	@PutMapping("/topics/{topicId}/courses/{id}")
	public void updateCourse(@PathVariable Long id, @RequestBody Course course,@PathVariable Long topicId){
		course.setTopic(new Topic(topicId,"",""));
		courseService.updateCourse(course);
	}
	
	@DeleteMapping("/courses/{id}")
	public String deleteCourse(@PathVariable Long id){
		 courseService.deleteCourse(id);
		return null;
	}
}
