package com.example.demo.application.model.cook;

public class FranceCook implements Cook{

	@Override
	public String getName() {
		return "フランス料理人";
	}

	@Override
	public String getFoodName() {
		return "フランス料理";
	}

	@Override
	public String getImageSrc() {
		return "image/job_chef_man.png";
	}

}