package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.dto.AddressDTO;
import com.capgemini.exception.IdNotFoundException;
import com.capgemini.service.AddressService;

@RestController
@RequestMapping(value="/Update")
@CrossOrigin(origins="http://localhost:4200")
public class Controller{
	
	@Autowired 
	private AddressService service;
/*update address method*/
	@PutMapping("/UpdateAddress")
	public ResponseEntity<String> updateAddress(@RequestBody AddressDTO address) {
		AddressDTO result = service.updateAddress(address);
		if (result == null) {
			throw new IdNotFoundException("Update Operation Unsuccessful,Provided Id does not exist");
		} else {
			return new ResponseEntity<String>("Address updated successfully",new HttpHeaders(), HttpStatus.OK);
		}
	}

	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<String> userNotFound(IdNotFoundException result) {
		return new ResponseEntity<String> (result.getMessage(),new HttpHeaders(), HttpStatus.OK);
	}
}