
package io.springbootStarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics  = new ArrayList<>(Arrays.asList(
			new Topic("11", "SpringBoot", "tutorial for SpringBootBasedREST"),
			new Topic("22", "DataStructures", "tutorial for Data Structures"),
			new Topic("33", "DropwizardFramework", "tutorial for DropwizardFramework")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id){
		return topics.stream().filter(t -> t.getTopicId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) 
	{
		for(int i = 0 ; i < topics.size(); i++)
		{
			Topic t = topics.get(i);
			if(t.getTopicId().equals(id)){
				topics.set(i, topic);
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getTopicId().equals(id));
	}
	
}
