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
	IdiomRepository idiomRepository;
	
	// C
	@Override
	public void addIdiom(Idiom idiom) {
		idiomRepository.save(idiom);	
	}

	// R
	@Override
	public List<Idiom> findAllIdiom() {
		return idiomRepository.findAll();
	}

	@Override
	public List<Idiom> findIdiomById(int idiomId) {
		return idiomRepository.findById(idiomId);
	}

	@Override
	public List<Idiom> findIdiomByIdiom(String word) {
		return idiomRepository.findIdiomByIdiom(word);
	}

	@Override
	public List<Idiom> findIdiomByLanguage(String language) {
		return idiomRepository.findByLanguage(language);
	}

	@Override
	public List<Idiom> findIdiomByTime(Timestamp dateTimeStart, Timestamp dateTimeEnd) {
		return idiomRepository.findIdiomByTime(dateTimeStart, dateTimeEnd);
	}

	// U
	@Override
	public void updateIdiom(Idiom idiom) {
		idiomRepository.save(idiom);
	}
	
	// D
	@Override
	public void deleteIdiom(int idiomId) {
		idiomRepository.deleteById(idiomId);
		
	}
}
