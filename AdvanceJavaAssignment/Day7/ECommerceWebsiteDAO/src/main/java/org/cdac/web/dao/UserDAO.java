package org.cdac.web.dao;

import org.cdac.web.model.User;

public interface UserDAO {
    boolean registerUser(User user);
    User authenticate(String userName, String password);
}
