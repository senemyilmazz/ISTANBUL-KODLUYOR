package com.tobeto.a.spring.rentacar.core.utilities.exceptions;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Configuration
@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler({MethodArgumentNotValidException.class})
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String handleValidationError(MethodArgumentNotValidException exception){
		return  "Validation hatası";
	}
	 @ExceptionHandler(RuntimeException.class)
	 @ResponseStatus(HttpStatus.BAD_REQUEST)
	 public String handleRunTimeException(RuntimeException exception){
		 return exception.getMessage();
	 }
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public String handleValidationError(Exception exception){
		return "Bilinmedik hata";
	}
}
