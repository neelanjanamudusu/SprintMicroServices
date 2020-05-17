package com.capgemini;


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
	public void testGetAddress(){
		List<AddressDTO> data=service.getAddress(436);
		
		//List<AddressDTO> result=new ArrayList<AddressDTO>();
		//result.add(new AddressDTO(46,450,"h-no:5/70A","vstcolony","hyderabad","medchal","telangana",(long)500039));
		Assertions.assertNotNull(data);
		
	} 
}
