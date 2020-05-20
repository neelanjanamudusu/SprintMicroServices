package com.capgemini.UpdateAddress;
   

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
  
  @SpringBootTest 
  public class DeleteAddressApplicationTests {
//	  @Autowired
//		TestRestTemplate testRestTemplate;
//		public void setTestRestTemplate(TestRestTemplate testRestTemplate)
//		{
//			this.testRestTemplate=testRestTemplate;
//		}
//		
//		@LocalServerPort
//		int localServerPort;
//		@Test
//		public void testdeleteAddress_Positive() throws Exception
//		{
//			 String url="http://localhost:"+localServerPort+"Delete/DeleteAddress/81";
//			  ResponseEntity<String> response = testRestTemplate.exchange(url,HttpMethod.DELETE,null,String.class);
//			 Assertions.assertEquals(200, response.getStatusCodeValue());
//		}
//		
//		@Test
//		public void testdeleteAddress_Negative() throws Exception
//		{
//			 String url="http://localhost:"+localServerPort+"Delete/DeleteAddress/1000";
//			  ResponseEntity<String> response = testRestTemplate.exchange(url,HttpMethod.DELETE,null,String.class);
//			 Assertions.assertEquals(404, response.getStatusCodeValue());
//		}
  }
 