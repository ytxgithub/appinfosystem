package com.appsys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.appsys.pojo.DataDictionary;
import com.appsys.service.DataDictionaryService;

@Controller
@RequestMapping("/data")
public class DataDictionaryController {
	@Autowired private DataDictionaryService dictionaryService;
	@RequestMapping("/list")
	@ResponseBody
	public List<DataDictionary> list(){
		List<DataDictionary> list=dictionaryService.listFlatform();
		return list;
	}
}
