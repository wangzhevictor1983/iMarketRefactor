package com.helpe.imarket.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.helpe.imarket.dao.SampleDao;
import com.helpe.imarket.entity.Sample;
import com.helpe.imarket.service.SampleService;

@Component
public class SampleServicempl implements SampleService{

	@Autowired
	private SampleDao sampleDao;
	
	public void save(Sample sample) {
		// TODO Auto-generated method stub
		sampleDao.save(sample);
	}

}
