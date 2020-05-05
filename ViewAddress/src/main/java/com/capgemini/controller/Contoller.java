package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.dto.AddressDTO;
import com.capgemini.service.AddressService;

@RestController
@RequestMapping("/AddressManagement")
@CrossOrigin("http://localhost:4200")
public class Contoller {
	@Autowired
	private AddressService s;
	
	@GetMapping("/GetAddress/{retailerId}")
	private List<AddressDTO> getAddresss(@PathVariable("retailerId") int retailerId) {
		return s.getAddress(retailerId);
}
}
