package com.helpe.imarket.provider.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.helpe.imarket.dao.ISampleDao;
import com.helpe.imarket.entity.Sample;
import com.helpe.imarket.provider.ISampleProvider;;

@Component
public class SampleProviderImpl implements ISampleProvider{

	@Autowired
	private ISampleDao sampleDao;
	
	public void save(Sample sample) {
		// TODO Auto-generated method stub
		sampleDao.save(sample);
	}
	
	public Sample findById(int id) {
		return sampleDao.findById(id);
	}
	
	public Sample findRecordById(int id) {
		return sampleDao.getSampleRecord(id);
	}

}
