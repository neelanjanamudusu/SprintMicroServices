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
	public AddressDTO updateAddress(AddressDTO address) {
		System.out.println(address.getRetailerId());
		System.out.println(dao.existsById(address.getRetailerId()));
		if(dao.existsById(address.getAddressId()))
			return dao.save(address);
		else 
			return null;
	}
}
