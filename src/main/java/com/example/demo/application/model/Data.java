package com.example.demo.application.model;

import java.util.ArrayList;
import java.util.List;

public class Data {
	private List<String> dataList = new ArrayList<String>();

	public List<String> getDataList() {
		return dataList;
	}

	public void addDataList(String data) {
		dataList.add(data);
	}
}
