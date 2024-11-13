package com.idiom.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idiom.model.IdiomExample;

public interface IdiomExampleDao extends JpaRepository<IdiomExample, Integer> {
	
	List<IdiomExample> findById(int example_id);
	
}
