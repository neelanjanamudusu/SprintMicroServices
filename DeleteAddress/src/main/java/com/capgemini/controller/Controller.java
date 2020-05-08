package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.service.AddressService;

@RestController
@RequestMapping("/Delete")
@CrossOrigin("http://localhost:4200")
public class Controller {
	@Autowired
	private AddressService s;
	
	@DeleteMapping("/DeleteAddress/{addressId}")
	public void deleteAddress(@PathVariable("addressId") int addressId) {
		s.deleteAddress(addressId);
	}
}
