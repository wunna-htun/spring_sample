package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface UserRepo extends JpaRepository<User,Long> {

	
	List<User>  findByName(String name);
	List<User>	findByPhNumber(String phNumber);
	List<User>  findByLocation(String location);
	List<User>	findByNameAndLocation(String name , String location);
	
}
