package com.example.demo.sparkjava.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DummyServiceImpl implements DummyService {
    @Override
    public void helloWorld() {
        System.out.println("Hello World!");
        log.error("Hello World!");
    }
}
