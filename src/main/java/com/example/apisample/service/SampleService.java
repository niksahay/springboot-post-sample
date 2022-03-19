package com.example.apisample.service;

import org.springframework.stereotype.Service;

@Service
public interface SampleService {

    public String getSampleData(SampleUser data);
}
