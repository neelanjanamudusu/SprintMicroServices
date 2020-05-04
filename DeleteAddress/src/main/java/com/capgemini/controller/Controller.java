package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.service.AddressService;

@RestController
@RequestMapping("/AddressManagement")
@CrossOrigin("http://localhost:2400")
public class Controller {
	@Autowired
	private AddressService s;
	
	@DeleteMapping("/DeleteAddress/{retailerId}")
	private void deleteAddress(@PathVariable("addressId") int addressId) {
		s.deleteAddress(addressId);
	}
}
