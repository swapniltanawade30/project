package com.grocerymanagementsystem.util;
//importing packages
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.grocerymanagementsystem.entity.Product;
import com.grocerymanagementsystem.model.ProductDTO;



@Component
public class Converter
{

	//convert ProductDTO to Entity(Product)
	public Product convertToEntity(ProductDTO productDTO)
	{
		Product product = new Product();
		if(productDTO!=null)
		{
			BeanUtils.copyProperties(productDTO, product);
		}
		return product;
	}
	
	//convert Entity(Product) to ProductDTO
	public ProductDTO convertToProductDTO(Product product)
	{
		ProductDTO productDTO = new ProductDTO();
		if(product!=null)
		{
			BeanUtils.copyProperties(product, productDTO);
		}
		return productDTO;
	}
}
