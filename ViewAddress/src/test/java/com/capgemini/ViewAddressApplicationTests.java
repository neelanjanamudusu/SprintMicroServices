package com.capgemini;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.dto.AddressDTO;
import com.capgemini.service.AddressService;

@SpringBootTest
public class ViewAddressApplicationTests {

	@Autowired
	private AddressService service;
	
	@Test
	public void  testGetAddress() {
		
		List<AddressDTO> data=service.getAddress(436);
		List<AddressDTO> result=new ArrayList<AddressDTO>();
		
		result.add(new AddressDTO(61,0,"updated","updated","updated","updated","updated",(long) 123456));
		
		Assertions.assertSame(result,data);
	}
	
	@Test
	public void  testGetAddressInvalid() throws Exception{
		
		List<AddressDTO> data=service.getAddress(436);
		Assertions.assertNotEquals(null,data);
	}	

}
