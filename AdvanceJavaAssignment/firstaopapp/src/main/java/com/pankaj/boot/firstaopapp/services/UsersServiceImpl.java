package com.pankaj.boot.firstaopapp.services;

import org.springframework.stereotype.Service;

import com.pankaj.boot.firstaopapp.entity.Users;

@Service
public class UsersServiceImpl implements UsersService 
{

	@Override
	public boolean authenticate(Users objUser) 
	{
		
		if(objUser.getUserName().equals("cdac") && objUser.getPassword().equals("dac"))
			return true;
		else
			return false;
	}

	@Override
	public void registerUser(Users objUser) {
		// TODO Auto-generated method stub
		
	}

}
