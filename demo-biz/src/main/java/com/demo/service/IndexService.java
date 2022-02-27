package com.demo.service;


import org.springframework.stereotype.Service;

@Service
public class IndexService {

    public String testReturn(){
        return "hello my spring custom";
    }

    public String abc(){
        return "a";
    }
}
