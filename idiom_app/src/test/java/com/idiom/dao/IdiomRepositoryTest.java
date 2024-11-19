package com.idiom.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.idiom.model.Idiom;

@SpringBootTest
public class IdiomRepositoryTest {
	@Autowired 
	IdiomRepository idiomRepository;
	
	// C
	
	// R
	@Test
	public void findIdiomByIdiomTest() {
		List<Idiom> list = idiomRepository.findIdiomByIdiom("idio");
		System.out.println(list.size());
	}
	
	//Test
	public void findIdiomByTimeTest() {
		List<Idiom> list = idiomRepository.findIdiomByTime(null);
		Idiom idiom = list.get(0);
		System.out.println("idiom_id:" + idiom.getIdiom_id() + "\tidiom:"+idiom.getIdiom() + "\tdefi:"+idiom.getDefinition()
		   + "\tlang:"+idiom.getLanguage() + "\tdate:"+idiom.getDate_time());
	}
	
	// U
	
	// D
}
