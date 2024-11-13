package com.idiom.service.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idiom.dao.IdiomDao;
import com.idiom.model.Idiom;
import com.idiom.service.IdiomService;

@Service
public class IdiomServiceImpl implements IdiomService {
	@Autowired
	IdiomDao idiomDao;
	
	// C
	@Override
	public void addIdiom(Idiom idiom) {
		idiomDao.save(idiom);	
	}

	// R
	@Override
	public List<Idiom> allIdiom() {
		return idiomDao.findAll();
	}

	@Override
	public List<Idiom> findIdiomById(int idiom_id) {
		return idiomDao.findById(idiom_id);
	}

	@Override // ToDo
	public List<Idiom> findIdiomByIdiom(String word) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override // ToDo
	public List<Idiom> findIdiomByLanguage(String language) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override  // ToDo
	public List<Idiom> findIdiomByTime(Timestamp date_time) {
		// TODO Auto-generated method stub
		return null;
	}

	// U
	@Override
	public void updateIdiom(Idiom idiom) {
		idiomDao.save(idiom);
		
	}
	
	// D
	@Override
	public void deleteIdiom(int idiom_id) {
		idiomDao.deleteById(idiom_id);
		
	}
}
