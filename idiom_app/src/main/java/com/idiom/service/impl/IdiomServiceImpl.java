package com.idiom.service.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.idiom.repository.IdiomRepository;
import com.idiom.model.Idiom;
import com.idiom.service.IdiomService;
import com.idiom.service.ServiceException;

@Service
@CrossOrigin
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
	public String findIdiomByIdiomId(int idiomId) throws ServiceException {
		try {
			if (idiomId < 1) {
				throw new ServiceException("idiomId doesn't exist");
			} else {
				List<Idiom> list = idiomRepository.findById(idiomId); 
				String idiom = list.get(0).getIdiom(); 
				return idiom;
			}
		} catch (ServiceException serviceException) {
			throw new ServiceException("idiomId doesn't exists");
		}
	}
	
	@Override
	public String findDefinitionByIdiomId(int idiomId) throws ServiceException {
		try {
			if (idiomId < 1) {
				throw new ServiceException("idiomId doesn't exist");
			} else {
				List<Idiom> list = idiomRepository.findById(idiomId); 
				String definition = list.get(0).getDefinition();
				return definition;
			}
		} catch (ServiceException serviceException) {
			throw new ServiceException("idiomId doesn't exists");
		}
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
	public void updateIdiom(int idiomId, String idiom, String definition, String language) {
		List<Idiom> list = idiomRepository.findById(idiomId);
		Idiom idiomObject = list.get(0);
		idiomObject.setIdiom(idiom);
		idiomObject.setDefinition(definition);
		idiomObject.setLanguage(language);
		
		idiomRepository.save(idiomObject);
	}
	
	// D
	@Override
	public void deleteIdiom(int idiomId) {
		idiomRepository.deleteById(idiomId);
		
	}

}
