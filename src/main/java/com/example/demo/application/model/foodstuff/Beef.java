package com.example.demo.application.model.foodstuff;

public class Beef extends Foodstuff{

	@Override
	public String getName() {
		return "牛肉";
	}

	@Override
	public int getPrice() {
		return 2000;
	}

	@Override
	public String getImageSrc() {
		return "image/animal_chara_ushi_nikuya.png";
	}

}
