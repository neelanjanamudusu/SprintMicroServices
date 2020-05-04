package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.dto.AddressDTO;
@Repository
public interface AddressDao extends JpaRepository<AddressDTO, Integer> {

}
