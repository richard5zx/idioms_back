package com.idiom.service.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idiom.dao.IdiomExampleDao;
import com.idiom.model.Idiom;
import com.idiom.model.IdiomExample;
import com.idiom.service.IdiomExampleService;

@Service
public class IdiomExampleServiceImpl implements IdiomExampleService {
	@Autowired
	IdiomExampleDao idiomExampleDao;
	
	// C
	@Override
	public void addIdiomExample(IdiomExample idiomExample) {
		idiomExampleDao.save(idiomExample);
	}

	// R
	@Override
	public List<IdiomExample> findAllIdiomExample() {
		return idiomExampleDao.findAll();
	}
	
	@Override
	public List<IdiomExample> findByExampleId(int example_id) {

		return idiomExampleDao.findById(example_id);
	}

	@Override // ToDo
	public List<IdiomExample> findByExample(String example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override // ToDo
	public List<IdiomExample> findExampleByTime(Timestamp date_time) {
		// TODO Auto-generated method stub
		return null;
	}

	// U
	@Override
	public void updateIdiomExample(IdiomExample idiomExample) {
		idiomExampleDao.save(idiomExample);
		
	}

	// D
	@Override
	public void deleteIdiomExample(int example_id) {
		idiomExampleDao.deleteById(example_id);
		
	}
}
