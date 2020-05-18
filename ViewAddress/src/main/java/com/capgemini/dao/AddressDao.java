package com.capgemini.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.capgemini.dto.AddressDTO;

@Repository
public interface AddressDao extends JpaRepository<AddressDTO, Integer>{
	//query to view address of particular retailerId
   @Query("select b from AddressDTO b where b.retailerId=?1")
	List<AddressDTO> getAddress(int retailerId);


}
