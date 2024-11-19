package com.idiom.dao.idiom;

import java.sql.Timestamp;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.idiom.dao.IdiomRepository;
import com.idiom.model.Idiom;

@SpringBootTest
public class IdiomRepositoryTest {
	@Autowired 
	IdiomRepository idiomRepository;
	
	// C
	
	// R
	//@Test
	public void findIdiomByIdiomTest() {
		List<Idiom> list = idiomRepository.findIdiomByIdiom("idio");
		System.out.println(list.size());
	}
	
	//@Test
	public void findIdiomByTimeTest() {
		Timestamp start = Timestamp.valueOf("2024-11-13 23:51:33");
		Timestamp end = Timestamp.valueOf("2024-11-13 23:54:00");
		List<Idiom> list = idiomRepository.findIdiomByTime(start, end);
		System.out.println(list.size());
	}
	
	// U
	
	// D
}
