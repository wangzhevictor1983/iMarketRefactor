package com.helpe.imarket.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.helpe.imarket.entity.Sample;
import com.helpe.imarket.framework.service.impl.AbstractService;
import com.helpe.imarket.provider.ISampleProvider;
import com.helpe.imarket.model.FrameworkSampleInput;
import com.helpe.imarket.model.FrameworkSampleOutput;

@Component
public class FrameworkSampleService extends AbstractService {
	@Resource
	private ISampleProvider provider;
	
	@Autowired
	private FrameworkSampleOutput output;
	
	public FrameworkSampleService(FrameworkSampleInput data) {
		super(data);
	}

	@Override
	protected FrameworkSampleOutput process() {
		Sample result = this.provider.findById(((FrameworkSampleInput) this.data).getId());
		this.output.setId(result.getId());
		this.output.setContent(result.getSampleText());
		return output;
	}

}
