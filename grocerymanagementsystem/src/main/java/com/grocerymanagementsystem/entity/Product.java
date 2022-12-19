package com.grocerymanagementsystem.entity;

import javax.persistence.CascadeType;
//importing packages
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
@ Program: creating entity class
code by : Krushikesh
Date : 16 December 2022
*/


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="product_details")
public class Product
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="product_name", nullable=false)
	private String productName;
	
	@Column(name="price", nullable = false)
	private int price; 
	
	@Column(nullable=false)
    private String description;
	
	  // Many products can buy one user 
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    //creatring getter setter
	public int getId() 
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getProductName() 
	{
		return productName;
	}

	public void setProductName(String productName) 
	{
		this.productName = productName;
	}

	public int getPrice() 
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

	public User getUser() 
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}
	
    
	
	

}
