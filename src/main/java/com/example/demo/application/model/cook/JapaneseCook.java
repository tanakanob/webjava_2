package com.example.demo.application.model.cook;

public class JapaneseCook implements Cook{

	@Override
	public String getName() {
		return "板前";
	}

	@Override
	public String getFoodName() {
		return "和食";
	}

	@Override
	public String getImageSrc() {
		return "image/job_sushi_syokunin.png";
	}

}
