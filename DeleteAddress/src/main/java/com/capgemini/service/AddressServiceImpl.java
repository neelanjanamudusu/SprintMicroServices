package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.dao.AddressDao;

@Service
public class AddressServiceImpl implements AddressService{
	@Autowired 
	private AddressDao dao;
	@Override
	public void deleteAddress(int addressId) {
		 dao.deleteById(addressId);
	}

}
