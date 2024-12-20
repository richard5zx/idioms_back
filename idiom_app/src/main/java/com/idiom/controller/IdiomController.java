package com.idiom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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
	@PutMapping("updateIdiom/{idiom_id}/{idiom}/{description}/{language}")
	public String updateIdiom(
			@PathVariable("idiom_id") String idiom_id,
			@PathVariable("idiom") String idiom,
			@PathVariable("description") String description,
			@PathVariable("language") String language
			) 
	{
		int idiom_id_in_int = Integer.parseInt(idiom_id);
		idiomServiceImpl.updateIdiom(idiom_id_in_int, idiom, description, language);
		return "Idiom Updated";
	}
	
	// D
	@DeleteMapping("deleteIdiom/{idiomId}")
	@Transactional
	public String deleteIdiom(@PathVariable("idiomId") int idiomId) {
		idiomExampleServiceImpl.deleteAllbyIdiomId(idiomId);
		idiomServiceImpl.deleteIdiom(idiomId);
		return "Idiom Deleted";
		
	}
}
