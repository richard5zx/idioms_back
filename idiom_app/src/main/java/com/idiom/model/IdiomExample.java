package com.idiom.model;

import java.sql.Timestamp;

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
	private String idiom;
	private String definition;
	private String language;
	private Timestamp date_time;
	
	public IdiomExample(String idiom, String definition, String language, Timestamp date_time) {
		super();
		this.idiom = idiom;
		this.definition = definition;
		this.language = language;
		this.date_time = date_time;
	}
	
	public IdiomExample() {
		super();
	}

}
