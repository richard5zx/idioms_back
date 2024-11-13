package com.idiom.service;

import java.sql.Timestamp;
import java.util.List;

import com.idiom.model.Idiom;
import com.idiom.model.IdiomExample;

public interface IdiomExampleService {
	// C
	public void addIdiomExample(IdiomExample idiomExample);
	
	// R
	public List<IdiomExample> findAll();
	public List<IdiomExample> findByExampleId(int example_id);
	public List<IdiomExample> findByExample(String example);
	public List<IdiomExample> findExampleByTime(Timestamp date_time);
	
	// U
	public void updateIdiomExample(IdiomExample idiomExample);
	
	// D
	public void deleteIdiomExample(int example_id);
}
