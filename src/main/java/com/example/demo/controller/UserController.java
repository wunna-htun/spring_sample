package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api")  
public class UserController {
	@Autowired
	UserService service;
	
	//user list
	@GetMapping("/user")

	public List<User> getAllUser(User user) {
		// TODO Auto-generated method stub
		return service.getAllUser(user);
	}
	
	//findByUserName
	@GetMapping("user/userName/{name}")
	public List<User> getbyUserName(@PathVariable String name){
		System.out.println(name);
		System.out.println(service.getByName(name));
		return service.getByName(name);
	}
	
	//findByUserId
	@GetMapping("user/{userId}")
	public ResponseEntity<Optional<User>> getByUserId(@PathVariable long userId) {
		System.out.println("get by userId");
		return new ResponseEntity<Optional<User>>(service.getById(userId),HttpStatus.OK);
		
	}
	
	
	//findUsernameAndLocation
	@GetMapping("user/nameAndLocation/{name}&&{location}")
	public ResponseEntity<List<User>> getUserNameAndLocation(@PathVariable String name  , String location){
		System.out.println("find user name and location ");
		return new ResponseEntity<List<User>>(service.getUserNameAndLocation("kyaw", "yangon"),HttpStatus.OK); 
	}
	
	
	//createUser
	@PostMapping("/user")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
		// TODO Auto-generated method stub
		return new ResponseEntity<User>(service.postUser(user),HttpStatus.OK);
		//return  service.postUser(user);
		}
	

	
	//updateByUserId
	@PutMapping("user/{userId}")
	public ResponseEntity<User> updateUser(@PathVariable long userId,@RequestBody User user){
		
		user.setId(userId);
		return new ResponseEntity<User>(service.updateUser(user),HttpStatus.OK);
	}
	
	//deleteByUserId
	@DeleteMapping("user/{userId}")
	public ResponseEntity<?> deleteUser(@PathVariable long userId){
		
		service.deleteUser(userId);
		
		return new ResponseEntity<>("User id " +userId+" is deleted",HttpStatus.OK);
	}
	
	@DeleteMapping("user/deleteAll")
	public ResponseEntity<?> deleteAllUser(){
		service.deleteAllUser();
		return new ResponseEntity<>("All user is Deleted",HttpStatus.OK);
	}
}
