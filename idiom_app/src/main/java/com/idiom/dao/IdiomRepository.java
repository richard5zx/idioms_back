package com.idiom.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idiom.model.Idiom;

public interface IdiomRepository extends JpaRepository<Idiom, Integer>{
	List<Idiom> findById(int idiom_id);
	List<Idiom> findByLanguage(String language);
}
