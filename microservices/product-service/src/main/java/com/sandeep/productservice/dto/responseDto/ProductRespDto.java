package com.sandeep.productservice.dto.responseDto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ProductRespDto {
	
	private String prodName;
	private String prodDesc;
	private  BigDecimal price;
}
