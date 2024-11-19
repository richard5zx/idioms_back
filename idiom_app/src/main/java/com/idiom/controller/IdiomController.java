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
import com.idiom.service.impl.IdiomServiceImpl;

@RestController
@RequestMapping("idiom")
@CrossOrigin
public class IdiomController {
	@Autowired
	IdiomServiceImpl idiomServiceImpl;
	
	// C
	@PostMapping("createIdiom")
	public String createIdiom(@RequestBody Idiom idiom) {
		idiomServiceImpl.addIdiom(null);
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
		idiomServiceImpl.updateIdiom(idiom);
		return "Idiom Updated";
	}
	
	// D
	@DeleteMapping("deleteIdiom/{idiomId}")
	public String deleteIdiom(@PathVariable("idiomId") int idiomId) {
		idiomServiceImpl.deleteIdiom(idiomId);
		return "Idiom Deleted";
		
	}
}
