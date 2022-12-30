package com.usbank.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.usbank.app.model.UserRequest;

@Service
public class UserRequestServiceImpl {

	@Autowired
    private KafkaTemplate<String, UserRequest> kafkaTemplate;
	private static final String TOPIC = "testTopic";
	public String sendingMessags(UserRequest userRequest) throws JsonProcessingException {
		kafkaTemplate.send(TOPIC, userRequest);
		ObjectMapper objectMapper=new ObjectMapper();
		System.out.println("Request Recived from user "+objectMapper.writeValueAsString(userRequest));
		return "Messages published to kafka Topic";
	}
	
	
	
	
}
