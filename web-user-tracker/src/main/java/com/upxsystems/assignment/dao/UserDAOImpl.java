package main.java.com.upxsystems.assignment.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import main.java.com.upxsystems.assignment.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	// need to inject hibernate session factory to talk to DB
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<User> getUsers() {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
		Query<User> theQuery = currentSession.createQuery("from User order by username", User.class);

		// execute query
		List<User> users = theQuery.getResultList();
		
		// return the result
		return users;
	}

	@Override
	public void saveUser(User user) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(user);		
	}

	@Override
	public User getUser(String id) {
		Session currentSession = sessionFactory.getCurrentSession();
		User user = currentSession.get(User.class, id);
		return user;
	}
	
	@Override
	public User updateUser(User user) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(user);		
		return user;
	}

	@Override
	public void deleteUser(String id) {
		Session currentSession = sessionFactory.getCurrentSession();
		User user = currentSession.get(User.class, id);
		currentSession.delete(user);
	}

}
