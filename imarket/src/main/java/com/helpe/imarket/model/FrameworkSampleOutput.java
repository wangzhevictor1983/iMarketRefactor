package com.helpe.imarket.model;

import com.helpe.imarket.framework.model.IModel;

public class FrameworkSampleOutput implements IModel{
    public void setId(long id) {
		this.id = id;
	}

	public void setContent(String content) {
		this.content = content;
	}

	private long id;
    private String content;

    public FrameworkSampleOutput(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
