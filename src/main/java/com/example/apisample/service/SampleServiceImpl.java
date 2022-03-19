package com.example.apisample.service;

import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {
    @Override
    public String getSampleData(SampleUser data) {
        return "You have posted sample data having id " + data.getId() + ", name as " + data.getName() + ", and description as " + data.getDesc();
    }
}
