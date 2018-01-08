package com.helpe.imarket.controller;

import java.util.concurrent.atomic.AtomicLong;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.helpe.imarket.model.*;
import com.helpe.imarket.service.impl.FrameworkSampleService;
import com.helpe.imarket.service.impl.SampleService;

@RestController
public class SampleController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private SampleService service;
    
    @RequestMapping(value="/sample", method=RequestMethod.GET)
    public SampleModel sample(@RequestParam(value="name", defaultValue="World") String name) {
    	logger.info("TEST");
        return new SampleModel(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping(value="/save", method=RequestMethod.POST)
    public String saveSample(@RequestParam(value="text", defaultValue="World") String text) {
    		SampleModel model = new SampleModel(counter.incrementAndGet(), String.format(template, text));
    		service.save(model);
    		return "OK";
    }
    
    @RequestMapping(value="/findSampleById", method=RequestMethod.GET)
    public SampleModel findSampleById(@RequestParam(value="id", defaultValue="1") int id) {
    	logger.info("TEST");
        return service.findById(id);
    }
    
    @RequestMapping(value="/findSampleRecordById", method=RequestMethod.GET)
    public SampleModel findSampleRecordById(@RequestParam(value="id", defaultValue="1") int id) {
    	logger.info("TEST");
        return service.findRecordById(id);
    }
    
    @RequestMapping(value="/findSampleRecordByPersistance", method=RequestMethod.GET)
    public SampleModel findSampleRecordByPersistance(@RequestParam(value="id", defaultValue="1") int id) {
    	logger.info("TEST");
        return service.findRecordByPersistance(id);
    }
    
    @RequestMapping(value="/frameworkTest", method=RequestMethod.GET)
    public FrameworkSampleOutput frameworkTest(@RequestParam(value="id", defaultValue="1")int id) {
    		FrameworkSampleInput input = new FrameworkSampleInput(id);
    		FrameworkSampleService service = new FrameworkSampleService(input);
    		return (FrameworkSampleOutput)service.execute();
    }
    
    
}
