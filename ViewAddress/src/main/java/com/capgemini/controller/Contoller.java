package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.dto.AddressDTO;
import com.capgemini.exception.IdNotFoundException;
import com.capgemini.service.AddressService;

@RestController
@RequestMapping("/View")
@CrossOrigin("http://localhost:4200")
public class Contoller {
	@Autowired
	private AddressService service;
	
	@GetMapping("/GetAddress/{retailerId}")
	private ResponseEntity<List<AddressDTO>> getAddress(@PathVariable("retailerId") int retailerId) {
		List<AddressDTO> result = service.getAddress(retailerId);
		if (result == null) {
			throw new IdNotFoundException("Id does not exist,so we couldn't fetch details");
		} else {
			return new ResponseEntity<List<AddressDTO>> (result,new HttpHeaders(), HttpStatus.OK);
		}
	}
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<String> userNotFound(IdNotFoundException result) {
		return new ResponseEntity<String> (result.getMessage(),new HttpHeaders(), HttpStatus.OK);
	}
}
