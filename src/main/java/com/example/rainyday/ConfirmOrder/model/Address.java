package com.example.rainyday.ConfirmOrder.model;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String streetname;
	private String city;
	private String country;
	private long postalcode;
	
	
	
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String streetname, String city, String country, long postalcode) {
		super();
		this.streetname = streetname;
		this.city = city;
		this.country = country;
		this.postalcode = postalcode;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(long postalcode) {
		this.postalcode = postalcode;
	}

}
