package com.improving;

import org.springframework.stereotype.Component;

@Component
public class Logger {
    public void println(String message) {
        System.out.println("> " + message);
    }
}
