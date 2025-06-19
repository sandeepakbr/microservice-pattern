package com.sandeep.productservice.dto.requestDto;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ProductReqsDto {
	
	@NotNull
	private String prodName;
	private String prodDesc;
	private  BigDecimal price;

}
