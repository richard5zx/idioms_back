package com.idiom.service;

import java.sql.Timestamp;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.idiom.model.Idiom;
import com.idiom.service.impl.IdiomServiceImpl;

@SpringBootTest
public class IdiomServiceImplTest {
	@Autowired
	IdiomServiceImpl idiomServiceImpl;
	
	// C
	@Test
	public void addIdiomTest() {
		Idiom idiom1 = new Idiom("idiom", "idiom2def", "chn");
		idiomServiceImpl.addIdiom(idiom1);
	}
	
	// R
	@Test
	public void allIdiomTest() {
		List<Idiom> list = idiomServiceImpl.findAllIdiom();
		for (Idiom idiom : list) {
			System.out.println("idiom_id:"+idiom.getIdiom_id()+"\tidiom:"+idiom.getIdiom()+"\tdefi:"+idiom.getDefinition()
							   +"\tlang:"+idiom.getLanguage()+"\tdate:"+idiom.getDate_time());
			
		}
	}
	
	@Test
	public void findIdiomByIdTest() {
		
	}
	
	@Test
	public void findIdiomByIdiomTest() {
		
	}
	
	@Test
	public void findIdiomByLanguageTest() {
		
	}
	
	@Test
	public void findIdiomByTimeTest() {
		
	}
	
	// U
	public void updateIdiomTest() {
		
	}
	
	// D
	public void deleteIdiomTEst() {
		
	}
}
