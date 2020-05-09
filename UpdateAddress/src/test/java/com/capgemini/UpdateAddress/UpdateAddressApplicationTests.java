
  package com.capgemini.UpdateAddress;
  
  //import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
  import org.junit.Test; 
  import org.springframework.beans.factory.annotation.Autowired; 
  import org.springframework.boot.test.context.SpringBootTest;
  import com.capgemini.dto.AddressDTO; 
  import com.capgemini.service.AddressService;
  
  @SpringBootTest 
  public class UpdateAddressApplicationTests {
  
  @Autowired 
  private AddressService service;
  
  @Test(expected=NullPointerException.class) 
  public void testUpdateAddress() throws Exception{ 
  AddressDTO update=new AddressDTO();
  update.setAddressId(420); 
  update.setCity("hyderabad");
  update.setDistrict("medchal"); 
  update.setHousenumber("h-no:5/70A");
  update.setPincode((long) 500039); 
  update.setRetailerId(436);
  update.setState("telangana"); 
  update.setStreetnumber("vstcolony"); 
  AddressDTO result=service.updateAddress(update); 
  assertSame(update,result); 
  //assertNull(update);
  }
  }
 