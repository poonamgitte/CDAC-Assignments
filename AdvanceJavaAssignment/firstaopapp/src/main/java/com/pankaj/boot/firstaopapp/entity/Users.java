package com.pankaj.boot.firstaopapp.entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Component
@Data
@AllArgsConstructor
public class Users 
{
	String userName;
	String password;
	
}
