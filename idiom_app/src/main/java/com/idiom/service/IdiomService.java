package com.idiom.service;

import java.sql.Timestamp;
import java.util.List;

import com.idiom.model.Idiom;

public interface IdiomService {
	// C
	public void addIdiom(Idiom idiom);
	
	// R
	public List<Idiom> findAllIdiom();
	public List<Idiom> findIdiomById(int idiomId);
	public List<Idiom> findIdiomByIdiom(String word);
	public List<Idiom> findIdiomByLanguage(String language);
	public List<Idiom> findIdiomByTime(Timestamp dateTimeStart, Timestamp dateTimeEnd);
	
	// U
	public void updateIdiom(Idiom idiom);
	
	// D
	public void deleteIdiom(int idiomId);
}
