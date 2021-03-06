package com.rest.webservice.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
public class UserResources {
	
	@Autowired
	private userDaoService service;
	
	@GetMapping(path="/users/")
	public List<User>retrieveAllUsers(){
		return service.findAll();
		
	}
	@GetMapping("/users/{id}")
	public User retriveUser(@PathVariable int id) {
		User user=service.findOne(id);
		return user;
		
		}
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		User user=service.deleteById(id);
		if(user==null)
			throw new UserNotFoundException("id-"+id);
		
		
		}
	

	
	@PostMapping("/users/")
	public void createUser(@RequestBody User user) {
		User savedUser=service.save(user);
	}
}
		
		
				
	
	


