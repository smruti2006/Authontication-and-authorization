package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.User1DTO;
import com.example.demo.Entity.User1;
import com.example.demo.Service.Register;

@RestController
public class User1Conroller {
	@Autowired
	Register userservice;
	@PostMapping("/register")
	public User1DTO addUser(@RequestBody User1 user) {
		User1 ruser = userservice.addUser(user);
		User1DTO nuser = new User1DTO();
		nuser.setId(ruser.getId());
		nuser.setUsername(ruser.getUsername());
		nuser.setRole(ruser.getRole());
		return nuser;
	}
	@GetMapping("/")
	public String Home() {
		return "Home";
	}
}
