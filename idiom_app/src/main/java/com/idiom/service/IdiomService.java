package com.idiom.service;

import java.sql.Timestamp;
import java.util.List;

import com.idiom.model.Idiom;

public interface IdiomService {
	// C
	public void addIdiom(Idiom idiom);
	
	// R
	public List<Idiom> findAllIdiom();
	public String findIdiomByIdiomId(int idiomId) throws ServiceException;
	public String findDefinitionByIdiomId(int idiomId) throws ServiceException;
	public List<Idiom> findIdiomByIdiom(String word);
	public List<Idiom> findIdiomByLanguage(String language);
	public List<Idiom> findIdiomByTime(Timestamp dateTimeStart, Timestamp dateTimeEnd);
	
	// U
	public void updateIdiom(int idiomId, String idiom, String definition, String language);
	
	// D
	public void deleteIdiom(int idiomId);
}
