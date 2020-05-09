package com.capgemini.UpdateAddress;
   
import static org.junit.Assert.assertNull;
//import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.dto.AddressDTO;
import com.capgemini.service.AddressService;
  
  @SpringBootTest 
  public class DeleteAddressApplicationTests {
	  @Autowired
		private AddressService service;
		
		@Test//(expected=NullPointerException.class)
		public void testDeleteAddress() throws Exception{
		//assertNull(,service.deleteAddress(123));
			
			
		}
  }
 