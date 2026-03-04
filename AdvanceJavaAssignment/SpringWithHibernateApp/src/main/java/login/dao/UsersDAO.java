package login.dao;


import java.util.List;

import login.model.Users;

public interface UsersDAO {

	public boolean authenticate(String username, String password);
	public boolean register(Users objUsers);
	public List<Users> allUsers();
}
