package com.example.springapp.Repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.springapp.Models.Worker;

public interface WorkerRepository extends MongoRepository<Worker, String> {
	List<Worker> findAll();

}
