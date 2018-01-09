package com.helpe.imarket.framework.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.helpe.imarket.framework.model.IModel;
import com.helpe.imarket.framework.service.IService;

@Component
public abstract class AbstractService implements IService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public IModel data;
	
	public AbstractService (IModel data){
		this.data = data;
	}

	@Override
	public IModel execute() {
		// TODO Auto-generated method stub
		logger.info(this.getClass().getName() + " execute method start!");
		IModel result = process();
		logger.info(this.getClass().getName() + " execute method end!");
		return result;
	}
	
	protected abstract IModel process();

}
