package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.exception.IdNotFoundException;
import com.capgemini.service.AddressService;

@RestController
@RequestMapping("/Delete")
@CrossOrigin("http://localhost:4200")
public class Controller {
	@Autowired
	private AddressService service;
	/*delete address method*/
	@DeleteMapping("/DeleteAddress/{addressId}")
	public void deleteAddress(@PathVariable("addressId") int addressId) {
		service.deleteAddress(addressId);
	}
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<String> userNotFound(IdNotFoundException result) {
		return new ResponseEntity<String> (result.getMessage(),new HttpHeaders(), HttpStatus.OK);
	}
}
