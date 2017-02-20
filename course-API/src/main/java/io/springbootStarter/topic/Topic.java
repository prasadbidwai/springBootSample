package io.springbootStarter.topic;

public class Topic {
	
	private String topicId;
	private String topicName;
	private String description;
	
	public Topic(){
		
	}
	
	public Topic(String topicId, String topicName, String description)
	{
		this.topicId = topicId;
		this.topicName = topicName;
		this.description = description;
	}
	
	public String getTopicId() {
		return topicId;
	}
	
	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}
	
	public String getTopicName() {
		return topicName;
	}
	
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
