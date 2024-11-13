package com.idiom.model;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="idiom_example")
public class IdiomExample {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idiom_id;
	
	@Column(name="idiom")
	private String idiom;
	
	@Column(name="definition")
	private String definition;
	
	@Column(name="language")
	private String language;
	
	@Column(name="date_time")
	@CreationTimestamp
	private Timestamp date_time;
	
	public IdiomExample(String idiom, String definition, String language) {
		super();
		this.idiom = idiom;
		this.definition = definition;
		this.language = language;
	}
	
	public IdiomExample() {
		super();
	}

}
