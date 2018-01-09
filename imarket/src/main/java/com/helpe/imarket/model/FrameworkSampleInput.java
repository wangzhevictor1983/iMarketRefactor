package com.helpe.imarket.model;

import org.springframework.stereotype.Component;

import com.helpe.imarket.framework.model.IModel;

@Component
public class FrameworkSampleInput implements IModel{
	
	private int id;
	
	public FrameworkSampleInput() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
