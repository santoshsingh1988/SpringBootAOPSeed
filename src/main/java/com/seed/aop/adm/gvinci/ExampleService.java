package com.seed.aop.adm.gvinci;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    public String testAPI() {
        return "Test API for logger using AOP !!";
    }
}
