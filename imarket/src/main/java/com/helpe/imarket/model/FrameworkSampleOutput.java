package com.helpe.imarket.model;

import org.springframework.stereotype.Component;

import com.helpe.imarket.framework.model.IModel;

@Component
public class FrameworkSampleOutput implements IModel{
    public void setId(long id) {
		this.id = id;
	}

	public void setContent(String content) {
		this.content = content;
	}

	private long id;
    private String content;

    public FrameworkSampleOutput() {

    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
