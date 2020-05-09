package com.capgemini;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.dto.AddressDTO;
import com.capgemini.service.AddressService;

@SpringBootTest
public class ViewAddressApplicationTests {

	@Autowired
	private AddressService service;
	
	@Test(expected=NullPointerException.class)
	public void testGetAddress() throws Exception{
		List<AddressDTO> data=service.getAddress(123);
		
		List<AddressDTO> result=new ArrayList<AddressDTO>();
		result.add(new AddressDTO(123,234,"sjdhgiu","sjgh","jzhfgiu","jshg","jwhsgi",(long) 243));
		assertSame(data,result);
		//assertNull(data);
	} 
}
