package com.idiom.dao.idiomExample;

import java.sql.Timestamp;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.idiom.dao.IdiomExampleRepository;
import com.idiom.model.IdiomExample;

@SpringBootTest
public class idiomExampleRepositoryTest {

	@Autowired
	IdiomExampleRepository idiomExampleRepository;
	
	// C
	
	// R
	//@Test
	public void findExampleByExampleTest( ) {
		List<IdiomExample> list = idiomExampleRepository.findExampleByExample("m");
		System.out.println(list.size());
	}
	
	//@Test
	public void findExampleByTimeTest( ) {
		Timestamp timeStart = Timestamp.valueOf("2024-11-19 17:03:02");
		Timestamp timeEnd = Timestamp.valueOf("2024-11-19 17:10:44");
		List<IdiomExample> list = idiomExampleRepository.findExampleByTime(timeStart, timeEnd);
		System.out.println(list.size());
	}
	
	// U
	
	// D
	@Test
	public void deleteAllIdiomExampleByIdTest() {
		
		for (int i = 1; i <= 5; i++) {
			idiomExampleRepository.save(new IdiomExample(8, "Some idiom2"));	
		}
		
		idiomExampleRepository.deleteAllByIdiomId(8);
	}

}
