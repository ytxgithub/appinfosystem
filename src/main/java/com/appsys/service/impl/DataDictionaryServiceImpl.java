package com.appsys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsys.mapper.DataDictionaryMapper;
import com.appsys.pojo.DataDictionary;
import com.appsys.service.DataDictionaryService;
@Service
public class DataDictionaryServiceImpl implements DataDictionaryService {
	@Autowired private DataDictionaryMapper dataDictionary;
	@Override
	public List<DataDictionary> listFlatform() {
		// TODO Auto-generated method stub
		return dataDictionary.listFlatform();
	}

}
