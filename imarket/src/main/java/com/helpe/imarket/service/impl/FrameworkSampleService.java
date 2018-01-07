package com.helpe.imarket.service.impl;

import javax.annotation.Resource;

import com.helpe.imarket.entity.Sample;
import com.helpe.imarket.framework.service.impl.AbstractService;
import com.helpe.imarket.provider.ISampleProvider;

public class FrameworkSampleService<FrameworkSampleOutput, FrameworkSampleInput> extends AbstractService<FrameworkSampleOutput, FrameworkSampleInput> {

	@Resource
	private ISampleProvider provider;
	
	public FrameworkSampleService(FrameworkSampleInput data) {
		super(data);
		// TODO Auto-generated constructor stub
		this.data = data;
	}

	@Override
	protected FrameworkSampleOutput process() {
		//provider.findRecordByEntityManager()
		//Sample result = provider.findById(((FrameworkSampleInput) this.data).getId());
		//this.data.
		System.out.println(this.data);
		return null;
	}

}
