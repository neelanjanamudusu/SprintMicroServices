package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.dao.AddressDao;
import com.capgemini.dto.AddressDTO;

@Service
public class AddressServiceImpl implements AddressService{
	@Autowired 
	private AddressDao dao;
	@Override
	public List<AddressDTO> getAddress(int retailerId) {
		return dao.getAddress(retailerId);
	}
}
