package com.springboot.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello From property";
    }
}
