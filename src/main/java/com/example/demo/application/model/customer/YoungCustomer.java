package com.example.demo.application.model.customer;

public class YoungCustomer implements Customer {

	@Override
	public String getName() {
		return "若い人";
	}

	@Override
	public String getImageSrc() {
		return "image/dance_shifuku1.png";
	}

}
