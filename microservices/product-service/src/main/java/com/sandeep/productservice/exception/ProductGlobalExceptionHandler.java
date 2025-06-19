package com.sandeep.productservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sandeep.productservice.common.ErrorMessageResponse;

@RestControllerAdvice
public class ProductGlobalExceptionHandler {


	@ExceptionHandler(exception = Exception.class)
	public ErrorMessageResponse productCreationFailedException() {
		
		return new ErrorMessageResponse("Error Prodcut Creation.", HttpStatus.BAD_REQUEST, HttpStatus.FAILED_DEPENDENCY);
		
	}

}
