package com.example.springapp.Models;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "worker")
@Data
public class Worker extends Person {

	public String workStatus;

	public Worker(String firstName, String lastName, String email) {
		super(firstName, lastName, email);
		this.workStatus = "swag";
	}

}
