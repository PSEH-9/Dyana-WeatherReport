/**
 * 
 */
package com.sapient.weatherforecast.controller;

import org.apache.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sapient.weatherforecast.model.ResponseMessage;

/**
 * @author indiahiring
 *
 */
@RestControllerAdvice
public class ControllerConfiguration {


	private final Logger logger = Logger.getLogger(ControllerConfiguration.class);

	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ResponseEntity<Object> exceptionMethod()  {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}
}
