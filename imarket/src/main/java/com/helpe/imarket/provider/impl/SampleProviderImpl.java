package com.helpe.imarket.provider.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.helpe.imarket.dao.ISampleDao;
import com.helpe.imarket.entity.Sample;
import com.helpe.imarket.provider.ISampleProvider;;

@Component
public class SampleProviderImpl implements ISampleProvider{

	@Autowired
	private ISampleDao sampleDao;
	
	@PersistenceContext
	private EntityManager entityManager;
	
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
	
	public Sample findRecordByEntityManager(int id) {
		Query query = this.entityManager.createQuery("from Sample u where u.id=:id",Sample.class);
        query.setParameter("id",id);
        Sample result = (Sample)query.getSingleResult();
        return result;
	}

}
