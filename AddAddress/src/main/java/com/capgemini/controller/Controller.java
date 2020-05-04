package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.dto.AddressDTO;
import com.capgemini.service.AddressService;

@RestController
@RequestMapping(value="/AddAddress")
@CrossOrigin(origins="http://localhost:2000")
public class Controller{
	
	@Autowired 
	private AddressService s;

	@PostMapping("/AddAddress")
	public AddressDTO AddAddress(@RequestBody AddressDTO address) {
		return s.addAddress(address);
}
}

