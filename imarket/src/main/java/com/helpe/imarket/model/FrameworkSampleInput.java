package com.helpe.imarket.model;

import com.helpe.imarket.framework.model.IModel;

public class FrameworkSampleInput implements IModel{
	
	private int id;
	
	public FrameworkSampleInput(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
