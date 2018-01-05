package com.helpe.imarket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //加入这个注解，Demo就会进行持久化了
@Table(name="Sample")
public class Sample {
	public Sample() {
		
	}
	public Sample(int id, String sampleText) {
		this.id = id;
		this.sampleText = sampleText;
	}

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="sampletext")
	private String sampleText;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSampleText() {
		return sampleText;
	}

	public void setSampleText(String sampleText) {
		this.sampleText = sampleText;
	}
	
}
