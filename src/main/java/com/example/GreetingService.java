package com.example;

public class GreetingService {

    public String getMessage(String name) {
        String safeName = (name == null || name.isBlank()) ? "World" : name.trim();
        return "Hello, " + safeName + "!";
    }
}
