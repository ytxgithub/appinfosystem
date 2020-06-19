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
	/**
	 * 查询所属平台  平板手机通用三个
	 * @return
	 */
	@RequestMapping("/list")
	@ResponseBody
	public List<DataDictionary> list(){
		List<DataDictionary> list=dictionaryService.listFlatform();
		return list;
	}
}
