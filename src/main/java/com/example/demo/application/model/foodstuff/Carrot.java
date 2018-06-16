package com.example.demo.application.model.foodstuff;

public class Carrot extends Foodstuff{

	@Override
	public String getName() {
		return "にんじん";
	}

	@Override
	public int getPrice() {
		return 100;
	}

	@Override
	public String getImageSrc() {
		return "image/character_ninjin.png";
	}

}