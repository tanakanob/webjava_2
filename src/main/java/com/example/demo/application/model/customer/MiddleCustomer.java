package com.example.demo.application.model.customer;

public class MiddleCustomer implements Customer {

	@Override
	public String getName() {
		return "中年";
	}

	@Override
	public String getImageSrc() {
		return "image/obasan2.png";
	}
}
