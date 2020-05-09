package com.capgemini.AddAddress;



import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.dto.AddressDTO;
import com.capgemini.service.AddressService;

@SpringBootTest
public class AddAddressApplicationTests {

	@Autowired
	private AddressService service;
	
	@Test(expected=NullPointerException.class)
	public void testAddAddress() throws Exception{
		AddressDTO add1=new AddressDTO();
		add1.setAddressId(420);
		add1.setCity("hyderabad");
		add1.setDistrict("medchal");
		add1.setHousenumber("h-no:5/70A");
		add1.setPincode((long) 500039);
		add1.setRetailerId(436);
		add1.setState("telangana");
		add1.setStreetnumber("vstcolony");
		AddressDTO result=service.addAddress(add1);
        assertSame(add1,result);
	}
	
}
