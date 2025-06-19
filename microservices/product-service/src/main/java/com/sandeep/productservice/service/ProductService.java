package com.sandeep.productservice.service;

import java.util.Set;

import org.springframework.http.ResponseEntity;

import com.sandeep.productservice.dto.responseDto.ProductRespDto;
import com.sandeep.productservice.entity.Product;

public interface ProductService {
	
	public Product createProduct(Product product);
	
	public Product updateProduct(Product product);
	
	public Product findProductById(Long productId);
	
	public Set<Product> findAllProduct();
	
	public Integer deleteProduct(Long ProductId);

}
