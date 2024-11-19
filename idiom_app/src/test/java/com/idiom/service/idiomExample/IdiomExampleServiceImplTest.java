package com.idiom.service.idiomExample;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.idiom.model.Idiom;
import com.idiom.model.IdiomExample;
import com.idiom.service.impl.IdiomExampleServiceImpl;

@SpringBootTest
public class IdiomExampleServiceImplTest {
	@Autowired
	IdiomExampleServiceImpl idiomExampleServiceImpl;
	
	// C
	@Test
	public void addIdiomExampleTest() {
		IdiomExample idiomExample = new IdiomExample(4, "Some idiom");
		idiomExampleServiceImpl.addIdiomExample(idiomExample);
	}
	
	// R
	public void findAllTest() {
		
	}
	
	@Test
	public void findByExampleIdTest() {
		
	}
	
	@Test // ToDo
	public void findByExampleTest() {
		
	}
	
	@Test // ToDo
	public void findExampleByTimeTest() {
		
	}
	
	// U
	//@Test
	public void updateIdiomExampleTest() {
		List<IdiomExample> list= idiomExampleServiceImpl.findIdiomExampleByExampleId(1);
		IdiomExample idiomExample = list.get(0);
		idiomExample.setExample("newExample");
		idiomExampleServiceImpl.updateIdiomExample(idiomExample);
	}
	
	// D
	//@Test
	public void deleteIdiomExampleTest() {
		idiomExampleServiceImpl.deleteIdiomExample(4);
	}
}
