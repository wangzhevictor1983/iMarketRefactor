package com.helpe.imarket.controller;

import java.util.concurrent.atomic.AtomicLong;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.helpe.imarket.entity.Sample;
import com.helpe.imarket.model.*;
import com.helpe.imarket.service.SampleService;

@RestController
public class SampleController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @Resource
    private SampleService sampleService;

    @RequestMapping(value="/sample", method=RequestMethod.GET)
    public SampleModel sample(@RequestParam(value="name", defaultValue="World") String name) {
    	logger.info("TEST");
        return new SampleModel(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping(value="/save", method=RequestMethod.POST)
    public String saveSample(@RequestParam(value="text", defaultValue="World") String text) {
    		Sample sample = new Sample();
    		sample.setSampleText(text);
    		sampleService.save(sample);
    		return "OK";
    }
}
