package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.OwnResponseHandler.OWnResponseHandler;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserRegistrationController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private OWnResponseHandler oWnResponseHandler;
	
	// to add new User
	@PostMapping(path="/user" , consumes="application/json")
	public ResponseEntity<Object> addUser(@RequestBody User user)
	{
	return oWnResponseHandler.response(HttpStatus.OK, false, "Success",this.userService.addUser(user));
		
	}
	// to get all user
	@GetMapping("/user")
	public List<User> getALLUser()
	{
		System.out.println("puja1234");
		return this.userService.getUser();
		
	}
	
	//to get particular user on the basis of id
	@GetMapping("/user/{userName}")
	public ResponseEntity<Object> getSalary(@PathVariable String userName)
	{
		System.out.println("puja123");
		
		User usr=userService.getUser(userName);
		
		if(usr==null)
		{
			return oWnResponseHandler.response(HttpStatus.BAD_REQUEST, true, "user does not exist",HttpStatus.BAD_REQUEST.value(),"User name not exist,plz enter correct username", "reponseCode11");
		}
		 return oWnResponseHandler.response(HttpStatus.OK, false, "Success", usr);
		
	}
	
	// to update user on the basis of id
	  @PutMapping(path="/user" ,consumes="application/json")
	  public ResponseEntity<Object>  updateUserDetails(@RequestBody User user)
	  {
		  return oWnResponseHandler.response(HttpStatus.OK, false, "Success",user); 
	  }
	  
	  
	  // to delete user on the basis of usrid
	@DeleteMapping("/user/{userId}")
	public ResponseEntity<Object> deleteUser(@PathVariable int userId)
	{
		Optional<User> user=userService.getUserById(userId);
		if(user==null)
		{
		return oWnResponseHandler.response(HttpStatus.BAD_REQUEST, true,"user does not exist",HttpStatus.BAD_REQUEST.value(),"User with this id does not exist try with another user id","myresposecode111");
		 }
		this.userService.deleteUser(userId);
		return oWnResponseHandler.response(HttpStatus.BAD_REQUEST, false,"sucess","user deleted successfully");
	}
}
