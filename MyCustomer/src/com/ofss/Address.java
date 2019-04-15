package com.ofss;

public class Address {
	int flatNo;
	String streetName;
	String city;
	long pincode;
	
	//Source ->Generate
	public Address(int flatNo, String streetName, String city, long pincode) {
		super();
		this.flatNo = flatNo;
		this.streetName = streetName;
		this.city = city;
		this.pincode = pincode;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString(){
		String msg = this.flatNo+" "+this.streetName+" "+this.city+" "+this.pincode;
		
		return msg;
	}
	

}
