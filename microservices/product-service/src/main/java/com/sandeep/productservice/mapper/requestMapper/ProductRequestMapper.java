package com.sandeep.productservice.mapper.requestMapper;

import org.springframework.stereotype.Component;

import com.sandeep.productservice.dto.requestDto.ProductReqsDto;
import com.sandeep.productservice.entity.Product;

@Component
public class ProductRequestMapper {

	public Product toProduct(ProductReqsDto product) {
		Product entity = new Product();
		entity.setPrice(product.getPrice());
		entity.setProdDesc(product.getProdDesc());
		entity.setProdName(product.getProdName());
		return entity;
		
	}

}
