package com.example.demo.application.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.application.model.Data;
import com.example.demo.application.model.ListForm;
import com.example.demo.application.model.ListService;
import com.example.demo.application.view.ListView;

@Controller
public class ListController extends BaseController {
	@RequestMapping(value="/itemlist", method = RequestMethod.GET)
	public ModelAndView show(/*ModelAndView mav*/) {
		ListService listService = new ListService();

		return new ListView(listService.getCookList(), listService.getCustomerList(), listService.getFoodstuffList(), new ListForm());
	}

	@RequestMapping(value="/itemlist", method = RequestMethod.POST)
	private ModelAndView order(/*ModelAndView mav, */@Valid ListForm listForm, BindingResult bindingResult, HttpServletRequest request) {

		if (bindingResult.getAllErrors().size() > 0) {
			// エラー(動作未確認)
			return new ModelAndView("redirect:/itemlist");
		}

		// フォームのデータを設定
		Data data = getDataFromSession();
		data.addDataList("「" + listForm.getCookName() + "」、「" + listForm.getFoodstuffName() + "」、「" + listForm.getCustomerName() +"」");

		// データをセッションへ保存
		setDataFromSession(data);

		// リダイレクト
		return new ModelAndView("redirect:/itemlist");
	}
}