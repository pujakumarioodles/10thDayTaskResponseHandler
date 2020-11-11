package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.User;

public interface UserService {

	public List<User> getUser();

	public User getUser(String userName);
	public User addUser(User user);
	public User  updateUserDetails(User user);
	public void deleteUser(int userId);
	
	public Optional<User> getUserById(int id);
}
