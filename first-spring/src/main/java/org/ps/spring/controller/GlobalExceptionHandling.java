package org.ps.spring.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@ControllerAdvice
public class GlobalExceptionHandling {
	@ExceptionHandler
	public String handleException(Exception e){
		System.out.println("Exception occurred: "+e.getMessage());
		return "error";
	}
}
