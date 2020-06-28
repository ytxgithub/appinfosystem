package com.appsys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.appsys.mapper.DataDictionaryMapper;
import com.appsys.pojo.DataDictionary;
import com.appsys.service.DataDictionaryService;
@Service
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
public class DataDictionaryServiceImpl implements DataDictionaryService {
	@Autowired private DataDictionaryMapper dataDictionary;
	@Override
	public List<DataDictionary> listFlatform() {
		// TODO Auto-generated method stub
		return dataDictionary.listFlatform();
	}

}
