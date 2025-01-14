package com.idiom.dao;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.idiom.model.IdiomExample;

public interface IdiomExampleRepository extends JpaRepository<IdiomExample, Integer> {
	
	// C
	@Modifying
	@Transactional
	@Query(value="INSERT INTO idiom_example (idiom_id, example) VALUES(?1, ?2)", nativeQuery=true)
	public void createIdiomExample(int idiomId, String example);
	
	// R
	List<IdiomExample> findById(int example_id);
	
	@Query(value="SELECT * FROM idiom_example WHERE example LIKE %?1%", nativeQuery=true)
	public List<IdiomExample> findExampleByExample(String example);
	
	@Query(value="SELECT * FROM idiom_example WHERE date_time BETWEEN ?1 AND ?2", nativeQuery=true)
	public List<IdiomExample> findExampleByTime(Timestamp dateTimeStart, Timestamp dateTimeEnd);
	
	@Query(value="SELECT * FROM idiom_example WHERE idiom_id = ?1", nativeQuery=true)
	public List<IdiomExample> findExampleByIdiomId(int idiomId);
	
	// U
	
	// D
	@Modifying
	@Transactional
	@Query(value="DELETE FROM idiom_example WHERE idiom_id = ?1", nativeQuery=true)
	public void deleteAllByIdiomId(int id);
	
}