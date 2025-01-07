package com.idiom.service;

import java.sql.Timestamp;
import java.util.List;

import com.idiom.model.IdiomExample;

public interface IdiomExampleService {
	// C
	public void addIdiomExample(IdiomExample idiomExample);
	
	// R
	public List<IdiomExample> findAllIdiomExample();
	public List<IdiomExample> findIdiomExampleByExampleId(int exampleId);
	public List<IdiomExample> findIdiomExampleByIdiomId(int idiomId);
	public List<IdiomExample> findIdiomExampleByExample(String example);
	public List<IdiomExample> findIdiomExampleExampleByTime(Timestamp dateTimeStart, Timestamp dateTimeEnd);
	
	// U
	public void updateIdiomExample(int exampleId, String example);
	
	// D
	public void deleteIdiomExample(int exampleId);
	public void deleteAllbyIdiomId(int id);
	
}
