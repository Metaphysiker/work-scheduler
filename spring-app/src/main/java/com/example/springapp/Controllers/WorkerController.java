package com.example.springapp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Models.Worker;
import com.example.springapp.Repositories.PersonRepository;
import com.example.springapp.Repositories.WorkerRepository;

@RestController
public class WorkerController {
	
    @Autowired
    private PersonRepository personRepository;
    
    @Autowired
    private WorkerRepository workerRepository;
    
	@GetMapping("/workers")
	public List<Worker> workers() {
		System.out.println("start");

		List<Worker> workers = workerRepository.findAll();
		System.out.println(workers);
		return workers;
	}
	
	@GetMapping("/workers/save")
	public Worker save_worker() {
	
		
		Worker worker = new Worker("Fritz", "Lug", "s.raess@me.com");
		workerRepository.save(worker);
		return worker;
	}
}
