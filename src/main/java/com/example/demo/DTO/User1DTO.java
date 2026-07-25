package com.example.demo.DTO;

import com.example.demo.Entity.Role;

public class User1DTO {
	private int id;
	private String username;
	private Role role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role2) {
		this.role = role2;
	}
}
