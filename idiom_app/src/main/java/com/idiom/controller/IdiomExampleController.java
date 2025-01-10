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

import com.idiom.model.IdiomExample;
import com.idiom.service.impl.IdiomExampleServiceImpl;

@RestController
@RequestMapping("idiomExample")
@CrossOrigin
public class IdiomExampleController {
	@Autowired
	IdiomExampleServiceImpl idiomExampleServiceImpl;

	// C
	@PostMapping("createIdiomExample")
	public String createIdiomExample(@RequestBody IdiomExample idiomExample) {
		idiomExampleServiceImpl.addIdiomExample(idiomExample);
		return "Example Added";
	}
	
	// R
	@GetMapping("getAllIdiomExample")
	public List<IdiomExample> getALlIdiomExample() {
		return idiomExampleServiceImpl.findAllIdiomExample();
	}
	
	@GetMapping("getIdiomExampleByIdiomId/{idiomId}")
	public List<IdiomExample> getIdiomExampleByIdiomId(@PathVariable("idiomId") int idiomId) {
		return idiomExampleServiceImpl.findIdiomExampleByIdiomId(idiomId);
	}
	
	// U
	@PutMapping("updateIdiomExample")
	public String updateIdiom(@RequestBody IdiomExample idiomExample) {
		idiomExampleServiceImpl.updateIdiomExample(idiomExample.getExampleId(), idiomExample.getExample());
		return "Example Updated";
	}
	
	// D
	@DeleteMapping("deleteIdiomExample/{exampleId}")
	public String deleteIdiomExample(@PathVariable("exampleId") int exampleID) {
		idiomExampleServiceImpl.deleteIdiomExample(exampleID);
		return "Example Deleted";
	}
}
