package com.grocerymanagementsystem.repository;


//importing package
import org.springframework.data.jpa.repository.JpaRepository;

import com.grocerymanagementsystem.entity.User;

/*
@ Program: creating repository class
code by : Swapnil
Date : 16 December 2022
*/



public interface UserRepository extends JpaRepository<User, Integer> 
{
	

}
