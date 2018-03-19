package com.blog.app.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		
		return topicService.getAllTopics();
				}
	/*
	 * spring mvc converts this list of topics into json. jason has key valu
	 * struture so key are property names and values are value of these
	 * properties
	 */
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable Long id){
		return topicService.getTopic(id);
		
	}
	
	@PostMapping(value="/topics")
	public String addTopic(@RequestBody Topic topic){
		topicService.addTopic(topic);
		return null;
		
	}
	@PutMapping("/topics/{id}")
	public void updateTopic(@PathVariable Long id, @RequestBody Topic topic){
		topicService.updateTopic(id,topic);
	}
	
	@DeleteMapping("/topics/{id}")
	public String deleteTopic(@PathVariable Long id){
		 topicService.deleteTopic(id);
		return null;
	}
}
