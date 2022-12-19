package com.grocerymanagementsystem.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
//importing packages
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
@ Program: creating entity class
code by : Swapnil
Date : 16 December 2022
*/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="user")

public class User
{
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int userId;
	    private String userName;
	    @Column(length = 30)
	    private String FirstName;
	    @Column(length = 30)
	    private String lastName;
	    @Column(length = 30)
	    private String email;
	    @Column(length = 50)
	    private String address;
	    @Column(length = 20)
	    private String password;
	   
	    //one user have many products
	    @OneToMany(cascade = CascadeType.ALL,
        mappedBy = "product")
        private List<Product> product = new ArrayList<>();

		public User(int userId, String userName, String firstName, String lastName, String email, String address,
				String password, List<Product> product) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.FirstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.address = address;
			this.password = password;
			this.product = product;
		}

		//creating getter and setter
		public int getUserId() 
		{
			return userId;
		}

		public void setUserId(int userId)
		{
			this.userId = userId;
		}

		public String getUserName() 
		{
			return userName;
		}

		public void setUserName(String userName) 
		{
			this.userName = userName;
		}

		public String getFirstName() 
		{
			return FirstName;
		}

		public void setFirstName(String firstName)
		{
			FirstName = firstName;
		}

		public String getLastName()
		{
			return lastName;
		}

		public void setLastName(String lastName) 
		{
			this.lastName = lastName;
		}

		public String getEmail()
		{
			return email;
		}

		public void setEmail(String email)
		{
			this.email = email;
		}

		public String getAddress()
		{
			return address;
		}

		public void setAddress(String address)
		{
			this.address = address;
		}

		public String getPassword()
		{
			return password;
		}

		public void setPassword(String password)
		{
			this.password = password;
		}

		public List<Product> getProduct()
		{
			return product;
		}

		public void setProduct(List<Product> product)
		{
			this.product = product;
		}
		
	  
}
