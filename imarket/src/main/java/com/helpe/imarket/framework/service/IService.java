package com.helpe.imarket.framework.service;

import org.springframework.stereotype.Component;

import com.helpe.imarket.framework.model.IModel;

@Component
public interface IService {
	IModel execute();
}
