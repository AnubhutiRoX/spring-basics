package main.java.com.upxsystems.assignment.dao;

import java.util.List;

import main.java.com.upxsystems.assignment.entity.User;

public interface UserDAO {
	public List<User> getUsers();
	public void saveUser(User user);
	public User getUser(String id);
	public User updateUser(User user);
	public void deleteUser(String id);
}
