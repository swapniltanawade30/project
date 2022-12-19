package com.grocerymanagementsystem.repository;

import java.util.List;

//importing packages
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.grocerymanagementsystem.entity.Product;

/*
@ Program: creating interface repository class
code by : Krushikesh
Date : 16 December 2022
*/


public interface ProductRepository extends JpaRepository<Product,Integer > 
{
	@Query("select p from Product p where p.producttName=?1")
	List<Product> getProductByName(String productName);
}
