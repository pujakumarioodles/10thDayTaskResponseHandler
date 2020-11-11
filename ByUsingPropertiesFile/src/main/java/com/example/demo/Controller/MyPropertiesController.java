package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPropertiesController {
	
	
	@Autowired
	private Messages messages;
	
	
	@GetMapping("/name")
	public String getName()
	{
		return messages.get("default.name");
	}
	
	@GetMapping("/email_id")
	public String getEmail_id()
	{
		return messages.get("email_id");
	}
	@GetMapping("/likes")
	public String getLikes()
	{
		return messages.get("likes");
	}
	@GetMapping("/dislikes")
	public String getDislikes()
	{
		return messages.get("dislikes");
	}

}
