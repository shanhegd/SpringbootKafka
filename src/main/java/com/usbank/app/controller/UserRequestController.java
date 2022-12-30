/**
 * 
 */
package com.usbank.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.usbank.app.model.UserRequest;
import com.usbank.app.serviceimpl.UserRequestServiceImpl;

/**
 * @author c084199
 *
 */
@RestController
public class UserRequestController {

	
//	@Autowired
//    private KafkaTemplate<String, UserRequest> kafkaTemplate;
	
	@Autowired
	UserRequestServiceImpl userRequestServiceImpl;
	
	
	 @GetMapping("/v2/publishmsg")
	 public String publishMessage(@RequestBody UserRequest userRequest) throws JsonProcessingException {
		 
		 	System.out.println("UserRequest DataSet "+userRequest);
		 	String msgPublished=userRequestServiceImpl.sendingMessags(userRequest);
	        return msgPublished+"  "+userRequest.getUsedBy();
	    }


}
