package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;
import com.example.demo.service.UserService;


@Service
public class UserServiceImpl implements UserService {


	@Autowired
	private UserRepo userRepo;	
	
	
	@PostConstruct
	public void addUserDetails()
	{
		
		List<User> users=new ArrayList<>();
		users.add(new User(1,"puja","pujakumari16935@gmail.com","ggjj437",4004));
		users.add(new User(2,"anuska","pujakumari16935@gmail.com","ggjj437",4004));
		users.add(new User(3,"anu","pujakumari16935@gmail.com","ggjj437",4004));
		users.add(new User(4,"arpita","pujakumari16935@gmail.com","ggjj437",4004));
		userRepo.saveAll(users);
	}


	@Override
	public List<User> getUser() {
	
		return  userRepo.findAll() ;
	}
	@Override
	public User getUser(String userName) {
		
		return userRepo.findByName(userName);
	}

	@Override
	public User addUser(User user) {
		
		
		return userRepo.save(user);
	}

	@Override
	public User updateUserDetails(User user) {
		return userRepo.save(user);
	}

	@Override
	public void deleteUser(int userId) {
		userRepo.deleteById(userId);
		
	}


	@Override
	public Optional<User> getUserById(int id) {
		
		return userRepo.findById(id);
	}
	

	}
