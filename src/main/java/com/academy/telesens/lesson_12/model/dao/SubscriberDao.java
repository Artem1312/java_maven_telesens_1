package com.academy.telesens.lesson_12.model.dao;

import com.academy.telesens.lesson_12.model.Subscriber;

import java.util.List;

public interface SubscriberDao {
    boolean save(Subscriber subscriber);
	boolean remove(Subscriber subscriber);
	List<Subscriber> getAll();
	Subscriber findById(long id);
}
