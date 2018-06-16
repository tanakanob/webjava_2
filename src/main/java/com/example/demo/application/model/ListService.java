package com.example.demo.application.model;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.application.model.cook.ChineseCook;
import com.example.demo.application.model.cook.Cook;
import com.example.demo.application.model.cook.JapaneseCook;
import com.example.demo.application.model.customer.Customer;
import com.example.demo.application.model.customer.MiddleCustomer;
import com.example.demo.application.model.customer.YoungCustomer;
import com.example.demo.application.model.foodstuff.Beef;
import com.example.demo.application.model.foodstuff.Egg;
import com.example.demo.application.model.foodstuff.Foodstuff;

public class ListService {
	public List<Cook> getCookList() {
		List<Cook> list = new ArrayList<Cook>();
		list.add(new JapaneseCook());
		list.add(new ChineseCook());
//		list.add(new FranceCook());
		return list;
	}

	public List<Customer> getCustomerList() {
		List<Customer> list = new ArrayList<Customer>();
		list.add(new YoungCustomer());
		list.add(new MiddleCustomer());
//		list.add(new OldCustomer());
		return list;
	}

	public List<Foodstuff> getFoodstuffList() {
		List<Foodstuff> list = new ArrayList<Foodstuff>();
		list.add(new Egg());
		list.add(new Beef());
//		list.add(new Carrot());
		return list;
	}
}
