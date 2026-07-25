package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User1;
import com.example.demo.Repository.UserRepository;

@Service
public class Login implements UserDetailsService{
	@Autowired
	UserRepository repository;
	@Override
	public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException{
		User1 user = repository.findByUsername(username);
		if(user==null) {
			throw new UsernameNotFoundException("User Not Found");
		}
		return User.builder()
				.username(user.getUsername())
				.password(user.getPassword())
				.roles(user.getRole().name())
				.build();
	}
		
}
