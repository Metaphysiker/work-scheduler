package com.example.springapp.Models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "worker")

public class Worker extends Person {

	public String workStatus;

	public Worker(String firstName, String lastName, String email) {
		super(firstName, lastName, email);
		// TODO Auto-generated constructor stub
		this.workStatus = "swag";
	}

}
