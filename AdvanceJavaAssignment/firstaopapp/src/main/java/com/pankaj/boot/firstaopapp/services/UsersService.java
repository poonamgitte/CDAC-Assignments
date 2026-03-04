package com.pankaj.boot.firstaopapp.services;

import com.pankaj.boot.firstaopapp.entity.Users;

public interface UsersService 
{
	// Methods that act upon the User
	public boolean authenticate(Users objUser);
	public void registerUser(Users objUser);
}
