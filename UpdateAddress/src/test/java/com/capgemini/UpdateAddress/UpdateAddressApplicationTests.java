package com.capgemini.UpdateAddress;
  

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired; 
  import org.springframework.boot.test.context.SpringBootTest;
  import com.capgemini.dto.AddressDTO;
  import com.capgemini.service.AddressService;
  
  @SpringBootTest 
  public class UpdateAddressApplicationTests {
  
	  @Autowired
		private AddressService service;
		
		@Test
		public void testUpdateAddress() {
			AddressDTO add1=new AddressDTO();
			add1.setAddressId(41);
			add1.setCity("hyderabad");
			add1.setDistrict("medchale");
			add1.setBuildingnumber("h-no:5/70A");
			add1.setPincode((long) 500039);
			add1.setRetailerId(436);
			add1.setState("telangana");
			add1.setStreetnumber("vstcolony");
			AddressDTO result=service.updateAddress(add1);
	       Assertions.assertSame(result,add1);
		}
		@Test
		public void testUpdateAddressInvalidCase() {
			AddressDTO add1=new AddressDTO();
			add1.setAddressId(41);
			add1.setCity("hyderabad");
			add1.setDistrict("medchal");
			add1.setBuildingnumber("h-no:5/70A");
			add1.setPincode((long) 500039);
			add1.setRetailerId(436);
			add1.setState("telangana");
			add1.setStreetnumber("vstcolony");
			AddressDTO result=service.updateAddress(add1);
	       Assertions.assertNotSame(result,add1);
		}
	}
