package main.java.com.upxsystems.assignment.service;

import java.util.List;

import main.java.com.upxsystems.assignment.entity.User;

public interface UserService {
	public List<User> getUsers();
	public void saveUser(User user);
	public User getUser(String id);
	public void updateUser(User user);
	public void deleteUser(String id);
}
