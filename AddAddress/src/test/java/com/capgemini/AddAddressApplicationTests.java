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
    // private TestRestTemplate restTemplate;
 private AddressService service;
//     @LocalServerPort
//     private int port;
//
//     private String getRootUrl() {
//         return "http://localhost:" + port;
//     }

	@Test
	public void testAddAddress() {
		AddressDTO address=new AddressDTO();
		address.setCity("hyderabad");
		address.setDistrict("medchal");
		address.setBuildingnumber("h-no:5/70A");
		address.setPincode((long) 500039);
		address.setRetailerId(450);
		address.setState("telangana");
		address.setStreetnumber("vstcolony");
		AddressDTO result=service.addAddress(address);
       Assertions.assertEquals(result,address);
//       ResponseEntity<String> postResponse = restTemplate.postForEntity(getRootUrl() + "/AddAddress", address, String.class);
//       assertNotNull(postResponse);
//       assertNotNull(postResponse.getBody());
	}
	@Test
	public void testAddAddressInvalidCase() {
		AddressDTO address=new AddressDTO();
		address.setAddressId(42);
		address.setCity("hyderabad");
		address.setDistrict("medchal");
		address.setBuildingnumber("h-no:5/70A");
		address.setPincode((long) 500039);
		address.setRetailerId(48609809);
		address.setState("telangana");
		address.setStreetnumber("vstcolonynbc");
		AddressDTO result=service.addAddress(address);
       Assertions.assertNotEquals(result,address);
//       ResponseEntity<String> postResponse = restTemplate.postForEntity(getRootUrl() + "/AddAddress", address, String.class);
//       assertNotNull(postResponse);
//       assertNotNull(postResponse.getBody());
	}
}
