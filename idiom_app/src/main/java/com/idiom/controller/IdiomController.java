package com.idiom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idiom.model.Idiom;
import com.idiom.service.impl.IdiomExampleServiceImpl;
import com.idiom.service.impl.IdiomServiceImpl;

@RestController
@RequestMapping("idiom")
@CrossOrigin
public class IdiomController {
	@Autowired
	IdiomServiceImpl idiomServiceImpl;
	
	@Autowired
	IdiomExampleServiceImpl idiomExampleServiceImpl;
	
	// C
	@PostMapping("createIdiom")
	public String createIdiom(@RequestBody Idiom idiom) {
		idiomServiceImpl.addIdiom(idiom);
		return "Idiom Added";
	}
	
	// R
	@GetMapping("getAllIdiom")
	public List<Idiom> getAllIdiom() {
		return idiomServiceImpl.findAllIdiom();
	}
	
	// U
	@PutMapping("updateIdiom")
	public String updateIdiom(@RequestBody Idiom idiom) {
		System.out.println(idiom.getLanguage());
		System.out.println(idiom.getDefinition());
		System.out.println(idiom.getIdiom());
		System.out.println(idiom.getIdiomId());
		idiomServiceImpl.updateIdiom(idiom.getIdiomId(), idiom.getIdiom(), idiom.getDefinition(), idiom.getLanguage());
		return "Idiom Updated";
	}
	
	// D
	@DeleteMapping("deleteIdiom/{idiomId}")
	public String deleteIdiom(@PathVariable("idiomId") int idiomId) {
		idiomExampleServiceImpl.deleteAllbyIdiomId(idiomId);
		idiomServiceImpl.deleteIdiom(idiomId);
		return "Idiom Deleted";
		
	}
}
