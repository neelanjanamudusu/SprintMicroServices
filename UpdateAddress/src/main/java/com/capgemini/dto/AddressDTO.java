package com.capgemini.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address_details")
public class AddressDTO {
@Id
@Column(length=5)
private int addressId;
@Column(length=5)
private int retailerId;
@Column(length=50)
private String housenumber;
@Column(length=30)
private String streetnumber;
@Column(length=10)
private String city;
@Column(length=10)
private String district;
@Column(length=15)
private String state;
@Column(length=10)
private Long pincode;


public int getRetailerId() {
	return retailerId;
}

public void setRetailerId(int retailerId) {
	this.retailerId = retailerId;
}

public int getAddressId() {
	return addressId;
}

public void setAddressId(int addressId) {
	this.addressId = addressId;
}

public String getHousenumber() {
	return housenumber;
}

public void setHousenumber(String housenumber) {
	this.housenumber = housenumber;
}

public String getStreetnumber() {
	return streetnumber;
}

public void setStreetnumber(String streetnumber) {
	this.streetnumber = streetnumber;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getDistrict() {
	return district;
}

public void setDistrict(String district) {
	this.district = district;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public Long getPincode() {
	return pincode;
}

public void setPincode(Long pincode) {
	this.pincode = pincode;
}

public AddressDTO( int addressId, int retailerId,String housenumber, String streetnumber, String city, String district,
		String state, Long pincode) {
	super();
	
	this.addressId = addressId;
	this.retailerId = retailerId;
	this.housenumber = housenumber;
	this.streetnumber = streetnumber;
	this.city = city;
	this.district = district;
	this.state = state;
	this.pincode = pincode;
}

public AddressDTO() {
	
}

}
