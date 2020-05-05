package com.capgemini.service;

import java.util.List;

import com.capgemini.dto.AddressDTO;

public interface AddressService {

	public List<AddressDTO> getAddress(int retailerId);

}
