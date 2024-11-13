package com.idiom.model;
import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="idiom")
public class Idiom {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idiom_id;
	private String idiom;
	private String definition;
	private String language;
	@CreationTimestamp
	private Timestamp date_time;
	
	public Idiom(String idiom, String definition, String language) {
		super();
		this.idiom = idiom;
		this.definition = definition;
		this.language = language;
	}
	
	public Idiom() {
		super();
	}

}
