package com.example.springapp.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Models.Worker;
import com.example.springapp.Repositories.WorkerRepository;

@RestController
public class WorkerController {

    @Autowired
    private WorkerRepository workerRepository;

	@GetMapping("/workers")
	@ResponseStatus(HttpStatus.OK)
	public List<Worker> workers() {
		System.out.println("start");

		List<Worker> workers = workerRepository.findAll();
		System.out.println(workers);
		return workers;
	}

	@PostMapping(path="/worker", consumes="application/json" )
	@ResponseStatus(HttpStatus.CREATED)
	public Worker postWorker(@RequestBody Worker worker) {
		return workerRepository.save(worker);
	}

	@PutMapping(path="/worker/{id}", consumes="application/json" )
	public Worker putWorker(@RequestBody Worker worker, @PathVariable String id) {

		Optional<Worker> workerInDb = workerRepository.findById(id);
		if(workerInDb.isPresent()) {
			worker.setId(workerInDb.get().id);
			workerRepository.save(worker);
			return worker;
		} else {
			throw new WorkerNotFoundException();
		}
	}

    @GetMapping("/not_found")
	@ResponseStatus(HttpStatus.NOT_FOUND)
    public String serviceUnavailable() {
        return "not found";
    }


	@GetMapping("/workers/save")
	public Worker save_worker() {
		Worker worker = new Worker("Fritz", "Lug", "s.raess@me.com");
		workerRepository.save(worker);
		return worker;
	}

	 @ResponseStatus(value=HttpStatus.NOT_FOUND, reason="worker not found")  // 404
	 public class WorkerNotFoundException extends RuntimeException {

	 }
}
