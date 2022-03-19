package com.example.apisample.controller;

import com.example.apisample.service.SampleService;
import com.example.apisample.service.SampleUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    public SampleService sampleService;

    @PostMapping("/samplepost")
    String postSampleUser(@RequestBody SampleUser sampleUser) {

        return sampleService.getSampleData(sampleUser);
    }
}
