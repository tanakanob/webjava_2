package com.example.demo.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.application.model.Data;
import com.example.demo.application.view.CartView;

@Controller
public class CartController extends BaseController {
	@RequestMapping(value="/cart", method = RequestMethod.GET)
	public ModelAndView show(/*ModelAndView mav*/) {

		Data data = getDataFromSession();

		ModelAndView mav = new CartView(data);
		return mav;
	}
}

