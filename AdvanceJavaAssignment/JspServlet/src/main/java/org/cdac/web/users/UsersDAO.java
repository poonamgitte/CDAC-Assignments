package org.cdac.web.users;
import java.sql.SQLException;

public interface UsersDAO {
     
	public Users login(String username , String password) throws SQLException;
	public Boolean signUp(String username , String password,String confPassword, String name , String email , String city) throws SQLException;
}
