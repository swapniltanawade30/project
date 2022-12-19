package com.grocerymanagementsystem.model;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
@ Program: creating DTO class
code by : Swapnil
Date : 16 December 2022
*/


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO
{
	 private int userId;
	 @NotNull
	 private String userName;
	 @NotNull
	 private String FirstName;
	 @NotNull
	 private String lastName;
	 @NotNull
	 private String email;
	 @NotNull
	 private String address;
	 @NotNull
	 private String password;
	 
	 
	

}
