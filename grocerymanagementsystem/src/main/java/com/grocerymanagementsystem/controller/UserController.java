package com.grocerymanagementsystem.controller;

//importing packages
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.grocerymanagementsystem.entity.User;
import com.grocerymanagementsystem.model.UserDTO;
import com.grocerymanagementsystem.service.UserService;
import com.grocerymanagementsystem.util.UserConverter;

/*
@ Program: creating entity class
code by : Swapnil
Date : 17 December 2022
*/

public class UserController 
{
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserConverter userConverter;
	
	@PostMapping("/createUser")
	public String createUser(@RequestBody UserDTO userDTO)
	{
		final User user= userConverter.convertToUserEntity(userDTO);
		return userService.createUser(user);
	}

}
