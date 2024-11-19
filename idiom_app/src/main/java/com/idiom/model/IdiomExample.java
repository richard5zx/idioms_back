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
	private Integer example_id;
	
	@Column(name="idiom_id")
	private Integer idiom_id;
	
	@Column(name="example")
	private String example;
	
	@Column(name="date_time")
	@CreationTimestamp
	private Timestamp date_time;

	public IdiomExample(Integer idiom_id, String example) {
		super();
		this.idiom_id = idiom_id;
		this.example = example;
	}
	
	public IdiomExample() {
		super();
	}

}
