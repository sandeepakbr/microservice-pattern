package com.sandeep.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sandeep.productservice.dto.requestDto.ProductReqsDto;
import com.sandeep.productservice.dto.responseDto.ProductRespDto;
import com.sandeep.productservice.mapper.requestMapper.ProductRequestMapper;
import com.sandeep.productservice.mapper.responseMapper.ProductResponseMapper;
import com.sandeep.productservice.service.ProductService;

import jakarta.validation.Valid;
import jakarta.validation.executable.ValidateOnExecution;

@RestController
@RequestMapping("/v1/api/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	@Autowired
	private ProductRequestMapper prodReqsMapper;
	
	@Autowired
	public ProductResponseMapper respMapper;
	
	@PostMapping("/addproduct")
	@ResponseStatus(HttpStatus.CREATED)
	@ValidateOnExecution
	public ResponseEntity<ProductRespDto> createProduct(@RequestBody @Valid ProductReqsDto product){
		
		return new ResponseEntity<ProductRespDto>(respMapper.toProductRespDto(productService.createProduct(prodReqsMapper.toProduct(product))),HttpStatus.CREATED);
		
	}

}
