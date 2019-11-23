package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.User;

public interface UserService {
	
	public List<User> getAllUser(User user);
	
	public List<User> getByName(String name);
	
	public Optional<User> getById(Long userId);
	
	public User postUser(User user);
	
	public User updateUser(User user);
	
	public void deleteUser(Long userId);
	
	public void deleteAllUser();
	
	public List<User> getUserNameAndLocation(String name,String location);
	
	
	

}
