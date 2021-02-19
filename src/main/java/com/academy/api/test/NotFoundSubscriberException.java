package com.academy.api.test;

public class NotFoundSubscriberException extends RuntimeException {
    private final int id;

    public NotFoundSubscriberException(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
