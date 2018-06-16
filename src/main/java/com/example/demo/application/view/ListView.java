package com.example.demo.application.view;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.example.demo.application.model.ListForm;
import com.example.demo.application.model.cook.Cook;
import com.example.demo.application.model.customer.Customer;
import com.example.demo.application.model.foodstuff.Foodstuff;

public class ListView extends ModelAndView {
	private String ATTRIBUTE_NAME_COOK_LIST      = "cookList";
	private String ATTRIBUTE_NAME_CUSTOMER_LIST  = "customerList";
	private String ATTRIBUTE_NAME_FOODSTUFFLIST  = "foodstuffList";
	private String ATTRIBUTE_NAME_LIST_FORM      = "listForm";

	private String VIEW_NAME = "itemlist";

	public ListView(List<Cook> cookList, List<Customer> customerList, List<Foodstuff> foodstuffList, ListForm listForm) {
		this.addObject(ATTRIBUTE_NAME_COOK_LIST, cookList);
		this.addObject(ATTRIBUTE_NAME_CUSTOMER_LIST, customerList);
		this.addObject(ATTRIBUTE_NAME_FOODSTUFFLIST, foodstuffList);
		this.addObject(ATTRIBUTE_NAME_LIST_FORM, listForm);
		this.setViewName(VIEW_NAME);
	}

	public ListView() {
		this.setViewName(VIEW_NAME);
	}
}