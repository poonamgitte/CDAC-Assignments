package com.pankaj.boot.firstaopapp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UsersAspect
{
	@Before("execution(public * com.pankaj.boot.firstaopapp.services.UsersService.authenticate(..))")
	public void logUserEntry(JoinPoint point)
	{
		// Log entry
		System.out.println("THe user is trying to authenticate");
	}

	@After("execution(public * com.pankaj.boot.firstaopapp.services.UsersService.authenticate(..))")
	public void logUserExit(JoinPoint point)
	{
		// Log entry
		System.out.println("THe user is completed authenticate");
	}

}
