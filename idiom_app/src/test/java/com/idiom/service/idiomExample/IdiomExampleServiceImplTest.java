package com.idiom.service.idiomExample;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.idiom.model.IdiomExample;
import com.idiom.service.impl.IdiomExampleServiceImpl;

@SpringBootTest
public class IdiomExampleServiceImplTest {
	@Autowired
	IdiomExampleServiceImpl idiomExampleServiceImpl;
	
	// C
	//@Test
	public void addIdiomExampleTest() {
		IdiomExample idiomExample = new IdiomExample(1, "idiom0");
		idiomExampleServiceImpl.addIdiomExample(idiomExample);
		IdiomExample idiomExample1 = new IdiomExample(1, "idiom1");
		idiomExampleServiceImpl.addIdiomExample(idiomExample1);
		IdiomExample idiomExample2 = new IdiomExample(1, "idiom2");
		idiomExampleServiceImpl.addIdiomExample(idiomExample2);
		IdiomExample idiomExample3 = new IdiomExample(1, "idiom3");
		idiomExampleServiceImpl.addIdiomExample(idiomExample3);
		IdiomExample idiomExample4 = new IdiomExample(1, "idiom4");
		idiomExampleServiceImpl.addIdiomExample(idiomExample4);
	}
	
	// R
	//@Test
	public void findAllTest() {
		List<IdiomExample> list= idiomExampleServiceImpl.findAllIdiomExample();
		for (IdiomExample idiomExample : list) {
			System.out.println("example_id:" + idiomExample.getExampleId() + "\tidiom_id:"+idiomExample.getIdiomId() + "\texample:"+idiomExample.getExample()
			   + "\ttime:"+idiomExample.getDateTime());
		}
	}
	
	//@Test
	public void findByExampleIdTest() {
		List<IdiomExample> list= idiomExampleServiceImpl.findIdiomExampleByExampleId(1);
		IdiomExample idiomExample = list.get(0);
		System.out.println("example_id:" + idiomExample.getExampleId() + "\tidiom_id:"+idiomExample.getIdiomId() + "\texample:"+idiomExample.getExample()
		   					+ "\ttime:"+idiomExample.getDateTime());
	}
	
	// U
	//@Test
	public void updateIdiomExampleTest() {
		idiomExampleServiceImpl.updateIdiomExample(1, "testExa");
	}

	// D
	//@Test
	public void deleteIdiomExampleTest() {
		idiomExampleServiceImpl.deleteIdiomExample(4);
	}
}
