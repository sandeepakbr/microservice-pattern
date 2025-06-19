package com.sandeep.productservice.serviceImpl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandeep.productservice.dto.responseDto.ProductRespDto;
import com.sandeep.productservice.entity.Product;
import com.sandeep.productservice.mapper.responseMapper.ProductResponseMapper;
import com.sandeep.productservice.repository.ProductRepository;
import com.sandeep.productservice.service.ProductService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository prodRepository;


	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return prodRepository.saveAndFlush(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findProductById(Long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Product> findAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteProduct(Long ProductId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
