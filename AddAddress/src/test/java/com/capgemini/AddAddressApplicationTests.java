package com.capgemini;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.dto.AddressDTO;
import com.capgemini.service.AddressService;

@SpringBootTest
public class AddAddressApplicationTests {

	@Autowired
	private AddressService service;
	
	@Test
	public void testAddAddress() {
		AddressDTO add1=new AddressDTO();
		add1.setCity("hyderabad");
		add1.setDistrict("medchal");
		add1.setBuildingnumber("h-no:5/70A");
		add1.setPincode((long) 500039);
		add1.setRetailerId(450);
		add1.setState("telangana");
		add1.setStreetnumber("vstcolony");
		AddressDTO result=service.addAddress(add1);
       Assertions.assertEquals(result,add1);
	}
	@Test
	public void testAddAddressInvalidCase() {
		AddressDTO add1=new AddressDTO();
		add1.setAddressId(42);
		add1.setCity("hyderabad");
		add1.setDistrict("medchal");
		add1.setBuildingnumber("h-no:5/70A");
		add1.setPincode((long) 500039);
		add1.setRetailerId(486);
		add1.setState("telangana");
		add1.setStreetnumber("vstcolonynbc");
		AddressDTO result=service.addAddress(add1);
       Assertions.assertNotEquals(result,add1);
	}
}
