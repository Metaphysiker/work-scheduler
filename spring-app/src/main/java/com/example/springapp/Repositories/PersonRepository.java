package com.example.springapp.Repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.springapp.Models.Person;
import com.example.springapp.Models.Worker;

public interface PersonRepository extends MongoRepository<Person, String> {
	List<Person> findAll();
}
