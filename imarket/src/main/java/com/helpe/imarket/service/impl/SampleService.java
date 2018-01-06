package com.helpe.imarket.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.helpe.imarket.entity.Sample;
import com.helpe.imarket.model.SampleModel;
import com.helpe.imarket.provider.ISampleProvider;
import com.helpe.imarket.service.ISampleService;

@Component
public class SampleService implements ISampleService{
	public SampleService() {
		
	}
	
	@Resource
	private ISampleProvider provider;
	public boolean save(SampleModel data) {
		Sample entity = new Sample();
		entity.setSampleText(data.getContent());
		provider.save(entity);
		return true;
	}
	
	public SampleModel findById(int id) {
		Sample resultById = provider.findById(id);
		SampleModel result = new SampleModel(resultById.getId(), resultById.getSampleText());
		return result;
	}
	
	public SampleModel findRecordById(int id) {
		Sample resultById = provider.findRecordById(id);
		SampleModel result = new SampleModel(resultById.getId(), resultById.getSampleText());
		return result;
	}
	
	
}
