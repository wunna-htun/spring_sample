package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.User;

public interface UserRepo extends JpaRepository<User,Long> {

	
	List<User>  findByName(String name);
	List<User>	findByPhNumber(String phNumber);
	List<User>  findByLocation(String location);
//	@Query("SELECT u FROM User u WHERE u.name = :name and u.location = :location")
//	List<User>	findByNameAndLocation(@Param("name") String name ,@Param("location") String location);
	List<User>	findByNameAndLocation(String name , String location);
	
}
