package com.grocerymanagementsystem.serviceimpl;
//importing packages

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.grocerymanagementsystem.Exception.ResourceNotFoundException;
import com.grocerymanagementsystem.entity.Product;
import com.grocerymanagementsystem.model.ProductDTO;
import com.grocerymanagementsystem.repository.ProductRepository;
import com.grocerymanagementsystem.repository.UserRepository;
import com.grocerymanagementsystem.service.ProductService;
import com.grocerymanagementsystem.util.Converter;

/*
@ Program: creating  service impl  class
code by : Krushikesh
Date : 16 December 2022
*/


public class ProductServiceImpl implements ProductService
{
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private Converter converter;

	@Override
	public String createProduct(Product product) {
		// TODO Auto-generated method stub
		String message=null;
		productRepository.save(product);
		if(product!=null)
		{
			message="Product details saved successfully";
		}
		return message;
	}

	@Override
	public ProductDTO updateProduct(int id, Product product) {
		// TODO Auto-generated method stub
		Product pProduct =productRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Product", "ID", id));
		pProduct.setProductName(product.getProductName());
		pProduct.setPrice(pProduct.getPrice());
        productRepository.save(pProduct);
		
		return converter.convertToProductDTO(pProduct);
		
	}

	@Override
	public ProductDTO getProductById(int id) {
		// TODO Auto-generated method stub
		Product getProduct = productRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Product", "ID", id));
		return converter.convertToProductDTO(getProduct);
	}

	@Override
	public List<ProductDTO> getAllProduct() {
		// TODO Auto-generated method stub
        List<Product> products=productRepository.findAll();
		
		List<ProductDTO> pDTO = new ArrayList<>();
		for(Product p: products)
		{
			pDTO.add(converter.convertToProductDTO(p));
		}
		return pDTO;
	}

	@Override
	public String deleteProductById(int id) {
		// TODO Auto-generated method stub
		String message = null;
		Optional<Product> product= productRepository.findById(id);
		if(product.isPresent())
		{
			productRepository.deleteById(id);
			message = "Product details deleted successfully";
		}
		else
		{
			message="Product details not found!!";
		}
		return message;
	}

	@Override
	public void deleteAllProduct() {
		// TODO Auto-generated method stub
		productRepository.deleteAll();
	}

	@Override
	public List<ProductDTO> getProductByName(String productName) {
		// TODO Auto-generated method stub
		List<Product> product = productRepository.getProductByName(productName);
		List<ProductDTO> productDTO = new ArrayList<>();
		for(Product p: product)
		{
			productDTO.add(converter.convertToProductDTO(p));
		}
		return productDTO;
	}
	
	
	

}
