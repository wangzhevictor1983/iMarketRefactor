package com.helpe.imarket.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.helpe.imarket.entity.Sample;
import com.helpe.imarket.model.SampleModel;
import com.helpe.imarket.provider.SampleProvider;

@Component
public class SampleService {
	public SampleService() {
		
	}
	
	@Resource
	private SampleProvider provider;
	public boolean save(SampleModel data) {
		Sample entity = new Sample();
		entity.setSampleText(data.getContent());
		provider.save(entity);
		return true;
	}
}
