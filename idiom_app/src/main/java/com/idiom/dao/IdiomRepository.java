package com.idiom.dao;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.idiom.model.Idiom;

public interface IdiomRepository extends JpaRepository<Idiom, Integer>{
	
	// C
	
	// R
	List<Idiom> findById(int idiom_id);
	
	@Query(value="SELECT * FROM idiom WHERE idiom LIKE %?1%", nativeQuery=true)
	List<Idiom> findIdiomByIdiom(String idiom);
	
	List<Idiom> findByLanguage(String language);
	
	@Query(value="Select * FROM idiom WHERE date_time BETWEEN ?1 AND ?2", nativeQuery=true)
	List<Idiom> findIdiomByTime(Timestamp start, Timestamp end);
	
	// U
	
	// D
}
