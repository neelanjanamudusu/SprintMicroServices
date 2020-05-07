package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.dao.AddressDao;
import com.capgemini.dto.AddressDTO;


@Service
public class AddressServiceImpl implements AddressService{
	
	@Autowired 
	private AddressDao dao;

	@Override
	public AddressDTO addAddress(AddressDTO address) {
		return dao.save(address);
	}
	
}
