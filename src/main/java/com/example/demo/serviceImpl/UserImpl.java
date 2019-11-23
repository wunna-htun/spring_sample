package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;
import com.example.demo.service.UserService;
import com.fasterxml.jackson.annotation.JsonFormat;

@Service
public class UserImpl implements UserService{

	
	
	@Autowired
	
	public UserRepo repository;
	@Override
	public List<User> getAllUser(User user) {
		// TODO Auto-generated method stub
		List<User> users= repository.findAll();
		for(User usercount :users) {
			System.out.println("User : "+usercount.toString());
		}
		
		return repository.findAll();
	}

	@Override
	public List<User> getByName(String name) {
		// TODO Auto-generated method stub
		return  repository.findByName(name);
	}

	@Override
	public User postUser(User user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}

	@Override
	public  void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		 repository.deleteById(userId);
	}



	@Override
	public void deleteAllUser() {
		// TODO Auto-generated method stub
		 repository.deleteAll();
		
	}

	@Override
	public Optional<User> getById(Long userId) {
		// TODO Auto-generated method stub
		return repository.findById(userId);
	}

	@Override
	public List<User> getUserNameAndLocation(String name, String location) {
		// TODO Auto-generated method stub
		return repository.findByNameAndLocation(name, location);
	}

	
	
	
	
	
	
}
