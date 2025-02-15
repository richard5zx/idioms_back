package com.idiom.service.idiom;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.idiom.model.Idiom;
import com.idiom.service.ServiceException;
import com.idiom.service.impl.IdiomServiceImpl;

@SpringBootTest
public class IdiomServiceImplTest {
	@Autowired
	IdiomServiceImpl idiomServiceImpl;
	
	// C
	//@Test
	public void addIdiomTest() {
		Idiom idiom1 = new Idiom("idiom3", "idiom3def", "deu");
		idiomServiceImpl.addIdiom(idiom1);
	}
	
	// R
	//@Test
	public void allIdiomTest() {
		List<Idiom> list = idiomServiceImpl.findAllIdiom();
		for (Idiom idiom : list) {
			System.out.println("idiom_id:" + idiom.getIdiomId() + "\tidiom:"+idiom.getIdiom() + "\tdefi:"+idiom.getDefinition()
							   + "\tlang:"+idiom.getLanguage() + "\tdate:"+idiom.getDateTime());
			
		}
	}
	
	@Test
	public void findIdiomByIdTest() throws ServiceException {
		String idiom = idiomServiceImpl.findIdiomByIdiomId(1);
		System.out.println(idiom);
		
	}
	
	//@Test
	public void findIdiomByLanguageTest() {
		List<Idiom> list = idiomServiceImpl.findIdiomByLanguage("chn");
		Idiom idiom = list.get(0);
		System.out.println("idiom_id:" + idiom.getIdiomId() + "\tidiom:"+idiom.getIdiom() + "\tdefi:"+idiom.getDefinition()
		   + "\tlang:"+idiom.getLanguage() + "\tdate:"+idiom.getDateTime());

	}
	
	// U
	@Test
	public void updateIdiomTest() {
		idiomServiceImpl.updateIdiom(1,"TestIdi", "TestDef", "TestLan");
	}
	
	// D
	//@Test
	public void deleteIdiomTest() {
		idiomServiceImpl.deleteIdiom(5);
	}
}
