package com.example.demo.application.view;

import org.springframework.web.servlet.ModelAndView;

import com.example.demo.application.model.Data;

public class CartView extends ModelAndView {
	private String ATTRIBUTE_NAME_DATA     = "data";
	private String VIEW_NAME = "cart";

	public CartView(Data data) {
		this.addObject(ATTRIBUTE_NAME_DATA, data);
		this.setViewName(VIEW_NAME);
	}
}