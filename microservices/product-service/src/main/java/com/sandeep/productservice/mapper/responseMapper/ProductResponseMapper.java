package com.sandeep.productservice.mapper.responseMapper;

import org.springframework.stereotype.Component;

import com.sandeep.productservice.dto.requestDto.ProductReqsDto;
import com.sandeep.productservice.dto.responseDto.ProductRespDto;
import com.sandeep.productservice.entity.Product;

@Component
public  class ProductResponseMapper {
	

		public ProductRespDto toProductRespDto(Product product) {
			ProductRespDto resp = new ProductRespDto(product.getProdName(), product.getProdDesc(), product.getPrice());
			return resp;
			
		}
	
		public ProductReqsDto toProductReqsDto(ProductRespDto product) {
			ProductReqsDto resp = new ProductReqsDto(product.getProdName(), product.getProdDesc(), product.getPrice());
			return resp;
			
		}

}
