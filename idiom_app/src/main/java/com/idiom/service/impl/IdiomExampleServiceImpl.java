package com.idiom.service.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idiom.dao.IdiomExampleRepository;
import com.idiom.model.IdiomExample;
import com.idiom.service.IdiomExampleService;

@Service
public class IdiomExampleServiceImpl implements IdiomExampleService {
	@Autowired
	IdiomExampleRepository idiomExampleRepository;
	
	// C
	@Override
	public void addIdiomExample(IdiomExample idiomExample) {
		idiomExampleRepository.save(idiomExample);
	}

	// R
	@Override
	public List<IdiomExample> findAllIdiomExample() {
		return idiomExampleRepository.findAll();
	}
	
	@Override
	public List<IdiomExample> findIdiomExampleByExampleId(int exampleId) {
		return idiomExampleRepository.findById(exampleId);
	}

	@Override
	public List<IdiomExample> findIdiomExampleByExample(String example) {
		return idiomExampleRepository.findExampleByExample(example);
	}
	
	@Override
	public List<IdiomExample> findIdiomExampleExampleByTime(Timestamp dateTimeStart, Timestamp dateTimeEnd) {
		return idiomExampleRepository.findExampleByTime(dateTimeStart, dateTimeEnd);
	}
	
	// U
	@Override
	public void updateIdiomExample(IdiomExample idiomExample) {
		idiomExampleRepository.save(idiomExample);
		
	}

	
	// D
	@Override
	public void deleteIdiomExample(int exampleId) {
		idiomExampleRepository.deleteById(exampleId);
		
	}

}
