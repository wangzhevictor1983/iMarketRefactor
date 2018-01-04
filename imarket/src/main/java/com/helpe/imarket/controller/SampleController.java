package com.helpe.imarket.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.helpe.imarket.model.*;

@RestController
public class SampleController {

	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/sample", method=RequestMethod.GET)
    public SampleModel sample(@RequestParam(value="name", defaultValue="World") String name) {
        return new SampleModel(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
