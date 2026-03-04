package login.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Query;
import login.model.Users;

public class UsersDAOImpl implements UsersDAO {
	
	@Autowired
	SessionFactory hibernateFactory;

	@Override
	public boolean authenticate(String username, String password) {
		
		Session hibernateSession = hibernateFactory.openSession();
		
		Users objUser = (Users)hibernateSession.find(Users.class, username);
		
		if(objUser == null) {
			return false;
		}
		
		if(objUser.getPassword().equals(password)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean register(Users objUsers) {
		
		return false;
	}

	@Override
	public List<Users> allUsers() {
		
		Session hibernateSession = hibernateFactory.openSession();
		Query query = hibernateSession.createQuery("from Users",Users.class);
		
		return query.getResultList();
	}

}
