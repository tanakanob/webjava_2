package com.example.demo.application.model.cook;

public class ChineseCook implements Cook{

	@Override
	public String getName() {
		return "中華料理人";
	}

	@Override
	public String getFoodName() {
		return "中華料理";
	}

	@Override
	public String getImageSrc() {
		return "image/chuka_chef.png";
	}

}