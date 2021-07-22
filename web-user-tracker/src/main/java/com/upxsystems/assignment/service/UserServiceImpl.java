package main.java.com.upxsystems.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import main.java.com.upxsystems.assignment.dao.UserDAO;
import main.java.com.upxsystems.assignment.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao;
	
	@Override
	@Transactional
	public List<User> getUsers() {
		return userDao.getUsers();	// delegate the call to DAO
	}

	@Override
	@Transactional
	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	@Override
	@Transactional
	public User getUser(String id) {
		return userDao.getUser(id);
	}

	@Override
	@Transactional
	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	@Override
	@Transactional
	public void deleteUser(String id) {
		userDao.deleteUser(id);
	}

}
