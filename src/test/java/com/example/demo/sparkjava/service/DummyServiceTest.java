package com.example.demo.sparkjava.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DummyServiceTest {

    @Test
    void test_helloworld() {
        DummyService service = new DummyServiceImpl();
        service.helloWorld();
        Assertions.assertTrue(true);
    }
}
