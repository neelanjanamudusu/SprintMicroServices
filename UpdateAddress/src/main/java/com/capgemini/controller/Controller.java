package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.dto.AddressDTO;
import com.capgemini.service.AddressService;

@RestController
@RequestMapping(value="/AddressManagement")
@CrossOrigin(origins="http://localhost:4000")
public class Controller{
	
	@Autowired 
	private AddressService s;

	@PutMapping("/UpdateAddress")
	public AddressDTO UpdateAddress(@RequestBody AddressDTO address) {
		return s.updateAddress(address);
	}
}