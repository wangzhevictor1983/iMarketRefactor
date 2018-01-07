package com.helpe.imarket.service;

import com.helpe.imarket.model.SampleModel;

public interface ISampleService extends IService{
	boolean save(SampleModel data);
	SampleModel findById(int id);
	SampleModel findRecordById(int id);
	SampleModel findRecordByPersistance(int id);
}
