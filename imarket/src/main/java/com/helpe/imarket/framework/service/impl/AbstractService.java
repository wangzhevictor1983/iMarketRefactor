package com.helpe.imarket.framework.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.helpe.imarket.framework.service.IService;

public abstract class AbstractService<T1, T2> implements IService<T1> {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	protected T2 data;
	
	public AbstractService (T2 data){
		this.data = data;
	}
	
	@Override
	public T1 execute() {
		// TODO Auto-generated method stub
		logger.info(this.getClass().getName() + " execute method start!");
		T1 result = process();
		logger.info(this.getClass().getName() + " execute method end!");
		return result;
	}
	
	protected abstract T1 process();

}
