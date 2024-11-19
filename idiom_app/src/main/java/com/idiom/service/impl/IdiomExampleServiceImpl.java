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
	public List<IdiomExample> findIdiomExampleByExampleId(int example_id) {
		return idiomExampleRepository.findById(example_id);
	}

	// U
	@Override
	public void updateIdiomExample(IdiomExample idiomExample) {
		idiomExampleRepository.save(idiomExample);
		
	}

	@Override
	public List<IdiomExample> findIdiomExampleByExample(String example) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<IdiomExample> findIdiomExampleExampleByTime(Timestamp date_time) {
		// TODO Auto-generated method stub
		return null;
	}
	
	// D
	@Override
	public void deleteIdiomExample(int example_id) {
		idiomExampleRepository.deleteById(example_id);
		
	}

}
