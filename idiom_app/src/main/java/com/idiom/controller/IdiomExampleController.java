package com.idiom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idiom.service.impl.IdiomExampleServiceImpl;

@RestController
@RequestMapping("IdiomExample")
@CrossOrigin
public class IdiomExampleController {
	@Autowired
	IdiomExampleServiceImpl idiomExampleServiceImpl;
	
	
}
