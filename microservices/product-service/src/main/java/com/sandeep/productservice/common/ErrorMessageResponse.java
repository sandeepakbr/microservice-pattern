package com.sandeep.productservice.common;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessageResponse {
	
	
	private String message;
	private String statusCode;
	private String error;
	
	public ErrorMessageResponse(String msg, HttpStatus badRequest, HttpStatus failedDependency) {
	}
}
