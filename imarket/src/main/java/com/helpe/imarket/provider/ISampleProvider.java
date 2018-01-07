package com.helpe.imarket.provider;

import com.helpe.imarket.entity.Sample;

public interface ISampleProvider extends IProvider{
	void save(Sample sample);
	Sample findById(int id);
	Sample findRecordById(int id);
	Sample findRecordByEntityManager(int id);
}
