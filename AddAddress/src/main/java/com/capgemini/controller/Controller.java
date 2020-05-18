package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.dto.AddressDTO;
import com.capgemini.exception.IdNotFoundException;
import com.capgemini.service.AddressService;

@RestController
@RequestMapping(value="/Add")
@CrossOrigin(origins="http://localhost:4200")
public class Controller{
	
	@Autowired 
	private AddressService service;
     /*add address method*/
	@PostMapping("/AddAddress")
	public ResponseEntity<String> addAddress(@RequestBody AddressDTO address) {
	AddressDTO result = service.addAddress(address);
		if (result == null) {
			throw new IdNotFoundException("Enter Valid Id");
		} else {
			return new ResponseEntity<String>("Address created successfully",new HttpHeaders(), HttpStatus.OK);
		}
	}
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<String> userNotFound(IdNotFoundException result) {
		return new ResponseEntity<String> (result.getMessage(),new HttpHeaders(), HttpStatus.OK);
	}
}

