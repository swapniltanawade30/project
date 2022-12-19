package com.grocerymanagementsystem.model;

//importing packages
import lombok.Getter;
import lombok.Setter;

/*
@ Program: creating productDTO class
code by : Krushikesh
Date : 16 December 2022
*/



@Getter
@Setter
public class ProductDTO 
{
	
	private int id;
	private String productName;
	private int price; 
	private String description;
	

}
