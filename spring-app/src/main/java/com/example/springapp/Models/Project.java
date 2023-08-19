package com.example.springapp.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "project")
public class Project {
	public Project(String name) {
		this.name = name;
	}
	@Id
	private String id;
	public String name;
	
}
