package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.User1;

public interface UserRepository extends JpaRepository<User1,Integer>{
	User1 findByUsername(String username);
}
