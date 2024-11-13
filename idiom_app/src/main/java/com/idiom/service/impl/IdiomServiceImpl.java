package com.idiom.service.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idiom.dao.IdiomRepository;
import com.idiom.model.Idiom;
import com.idiom.service.IdiomService;

@Service
public class IdiomServiceImpl implements IdiomService {
	@Autowired
	IdiomRepository idiomRepsitory;
	
	// C
	@Override
	public void addIdiom(Idiom idiom) {
		idiomRepsitory.save(idiom);	
	}

	// R
	@Override
	public List<Idiom> findAllIdiom() {
		return idiomRepsitory.findAll();
	}

	@Override
	public List<Idiom> findIdiomById(int idiom_id) {
		return idiomRepsitory.findById(idiom_id);
	}

	@Override // ToDo
	public List<Idiom> findIdiomByIdiom(String word) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Idiom> findIdiomByLanguage(String language) {
		return idiomRepsitory.findByLanguage(language);
	}

	@Override  // ToDo
	public List<Idiom> findIdiomByTime(Timestamp date_time) {
		// TODO Auto-generated method stub
		return null;
	}

	// U
	@Override
	public void updateIdiom(Idiom idiom) {
		idiomRepsitory.save(idiom);
		
	}
	
	// D
	@Override
	public void deleteIdiom(int idiom_id) {
		idiomRepsitory.deleteById(idiom_id);
		
	}
}
