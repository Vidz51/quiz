package com.blog.app.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.blog.app.topic.Topic;

@Entity
public class Course {
	
	@Id
	private Long id;
	private String name;
	private String description;
	@ManyToOne
	private Topic topic;
	

	public Course() {

	}

	public Course(Long i, String name, String description, Long topicId) {
		super();
		this.id = i;
		this.name = name;
		this.description = description;
		this.topic = new Topic(topicId,"","");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	

}
