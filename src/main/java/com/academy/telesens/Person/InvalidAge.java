package com.academy.telesens.Person;

public class InvalidAge extends RuntimeException {
    public InvalidAge(String message) {
        super(message);
    }

    public InvalidAge() {

    }
}
