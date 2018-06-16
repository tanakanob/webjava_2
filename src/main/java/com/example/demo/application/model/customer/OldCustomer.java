package com.example.demo.application.model.customer;

public class OldCustomer implements Customer {

	@Override
	public String getName() {
		return "老人";
	}

	@Override
	public String getImageSrc() {
		return "image/roujinsya_obaasan2.png";
	}
}
