package com.grocerymanagementsystem.controller;

//importing packages
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.grocerymanagementsystem.entity.Product;
import com.grocerymanagementsystem.model.ProductDTO;
import com.grocerymanagementsystem.service.ProductService;
import com.grocerymanagementsystem.util.Converter;



/*
@ Program: creating controller class
code by : Krushikesh
Date : 17 December 2022
*/


@RestController
public class ProductController
{
	@Autowired
	private ProductService productService;
	
	@Autowired
	private Converter converter;
	
	//build create Product REST API
		@PostMapping("/createProduct")
		public ResponseEntity<String> createProduct(@RequestBody  ProductDTO productDTO)
		{
			final Product product= converter.convertToEntity(productDTO);
			productService.createProduct(product);
			return new ResponseEntity<String>("New Product details added",
					HttpStatus.CREATED);
		}
		
		//build update product details REST API
		@PutMapping("/updateProduct/{identity}")
		public ProductDTO updateProduct(@PathVariable("identity") int id,
				@RequestBody ProductDTO productDTO)
		{
			Product product1 = converter.convertToEntity(productDTO);
			return productService.updateProduct(id, product1);
		}
		
		//build get product details using id REST API
		@GetMapping("/getProductById/{id}")
		public ProductDTO getProductById(@PathVariable("id") int id)
		{
			return productService.getProductById(id);
		}
		
		
		//build get all Product details REST API
		@GetMapping("/getAllProducts")
		public List<ProductDTO> getAllProduct()
		{
			return productService.getAllProduct();
		}
		
		//build delete product details using id REST API
		@DeleteMapping("/deleteProductById/{id}")
		public String deleteProductById(@PathVariable("id") int id)
		{
			return productService.deleteProductById(id);
		}
		
		@DeleteMapping("/deleteAllProducts")
		public ResponseEntity<String> deleteAllProduct()
		{
			productService.deleteAllProduct();
			return new ResponseEntity<String>("All Products details "
					+ "have been deleted",HttpStatus.OK);
		}
		
		@GetMapping("/getProductByName/{name}")
		public List<ProductDTO> getProductByName(@PathVariable("name") String productName)
		{
			return productService.getProductByName(productName);
		}
}
