package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Generated
@Getter
@Setter
public class Post {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	@Column(name="Title")
	String title;
	
	@Column(name="Description")
	String description;
	
	@Column(name="Content")
	String Content;
	
	
	
	

}
