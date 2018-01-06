package com.helpe.imarket.provider;

import com.helpe.imarket.entity.Sample;

public interface ISampleProvider {
	public void save(Sample sample);
	public Sample findById(int id);
	public Sample findRecordById(int id);
}
