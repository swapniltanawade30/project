package com.grocerymanagementsystem.service;

//importing packages
import java.util.List;

import com.grocerymanagementsystem.entity.Product;
import com.grocerymanagementsystem.model.ProductDTO;
import com.student.model.StudentDTO;


/*
@ Program: creating interface service class
code by : Krushikesh
Date : 16 December 2022
*/


public interface ProductService
{
	String createProduct(Product product);
	ProductDTO updateProduct(int id, Product product);
	ProductDTO getProductById(int id);
	List<ProductDTO> getAllProduct();
	String deleteProductById(int id);
	void deleteAllProduct();

	List<ProductDTO> getProductByName(String productName);
	
}
