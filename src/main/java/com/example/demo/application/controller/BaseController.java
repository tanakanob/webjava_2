package com.example.demo.application.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.application.model.Data;

public class BaseController {
	@Autowired
	private HttpSession session;

	private final String KEY_SESSION_MESSAGE = "message";
	private final String KEY_SESSION_DATA    = "data";

	protected Data getDataFromSession() {
		Data data = (Data)session.getAttribute(KEY_SESSION_DATA);
		if(data == null) {
			data = new Data();
			setDataFromSession(data);
		}
		return data;
	}

	protected void setDataFromSession(Data data) {
		session.setAttribute(KEY_SESSION_DATA, data);
	}

	protected String getMessageFromSession() {
		return (String) session.getAttribute(KEY_SESSION_MESSAGE);
	}

	protected void setMessageFromSession(String message) {
		session.setAttribute(KEY_SESSION_MESSAGE, message);
	}

	protected void removeMessageFromSession() {
		session.removeAttribute(KEY_SESSION_MESSAGE);
	}
}