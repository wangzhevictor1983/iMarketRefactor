package com.helpe.imarket.model;

public class SampleModel {
    private final long id;
    private final String content;

    public SampleModel(long id, String content) {
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
