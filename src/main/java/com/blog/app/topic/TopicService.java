package com.blog.app.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	/*private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic(12221L, "Spring", "Spring Description"),
			new Topic(12222L, "Hibernate", "Hibernate Description"),
			new Topic(12223L, "Angular", "Angular Description")));*/

	public List<Topic> getAllTopics(){
		//return topics;
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics ::add);
		
		return topics;
	}
	public Topic getTopic(Long id){
		 //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		//topics.add(topic);
		topicRepository.save(topic);
	}
	public void updateTopic(Long id, Topic topic) {
		/*topics.stream().filter(t->t.getId().equals(id))
						.map(t->topics.set(topics.indexOf(t), topic))
						.collect(Collectors.toList());
		  */
		topicRepository.save(topic);
		
	}
	public void deleteTopic(Long id) {
		//topics.removeIf(t -> t.getId().equals(id));
		topicRepository.delete(id);
		
	}
}