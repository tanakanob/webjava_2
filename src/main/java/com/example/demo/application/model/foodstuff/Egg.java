package com.example.demo.application.model.foodstuff;

public class Egg extends Foodstuff{

	@Override
	public String getName() {
		return "たまご";
	}

	@Override
	public int getPrice() {
		return 150;
	}

	@Override
	public String getImageSrc() {
		return "image/eto_tori_egg.png";
	}

}