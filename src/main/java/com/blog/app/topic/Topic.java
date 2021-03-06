package com.blog.app.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	private Long id;
	private String name;
	private String description;

	public Topic() {

	}

	public Topic(Long i, String name, String description) {
		super();
		this.id = i;
		this.name = name;
		this.description = description;
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

}
