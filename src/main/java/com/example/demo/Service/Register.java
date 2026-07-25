package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User1;
import com.example.demo.Repository.UserRepository;

@Service
public class Register {
	@Autowired
	UserRepository repository;
	@Autowired
	PasswordEncoder passwordencoder;
	public User1 addUser(User1 user) {
		user.setPassword(passwordencoder.encode(user.getPassword()));
		return repository.save(user);
	}
}
