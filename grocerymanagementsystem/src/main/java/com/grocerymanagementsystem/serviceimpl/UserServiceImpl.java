package com.grocerymanagementsystem.serviceimpl;
//importing packages

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocerymanagementsystem.entity.User;
import com.grocerymanagementsystem.repository.UserRepository;
import com.grocerymanagementsystem.service.UserService;
import com.grocerymanagementsystem.util.UserConverter;




/*
@ Program: creating serviceimpl class
code by : Swapnil
Date : 16 December 2022
*/

@Service
public class UserServiceImpl  implements UserService
{
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserConverter userConverter;

	@Override
	public String createUser(User user) {
		// TODO Auto-generated method stub
		String message=null;
		userRepository.save(user);
		if(user!=null)
		{
			message="New user saved successfully!!";
		}
		else
		{
			message="User was not saved!!";
		}
		return message;
	}
	}

