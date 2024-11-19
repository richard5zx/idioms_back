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
	@Column(name="example_id")
	private Integer exampleId;
	
	@Column(name="idiom_id")
	private Integer idiomId;
	
	@Column(name="example")
	private String example;
	
	@Column(name="date_time")
	@CreationTimestamp
	private Timestamp dateTime;

	public IdiomExample(Integer idiomId, String example) {
		super();
		this.idiomId = idiomId;
		this.example = example;
	}
	
	public IdiomExample() {
		super();
	}

}
