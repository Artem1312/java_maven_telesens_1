package com.academy.telesens.lesson_12.model.dao.jdbc;

import com.academy.telesens.lesson_12.model.Subscriber;
import com.academy.telesens.lesson_12.model.dao.SubscriberDao;

import java.util.List;

public class SubscriberDaoImpl implements SubscriberDao {
    @Override
    public boolean save(Subscriber subscriber) {
        return false;
    }

    @Override
    public boolean remove(Subscriber subscriber) {
        return false;
    }

    @Override
    public List<Subscriber> getAll() {
        return null;
    }

    @Override
    public Subscriber findById(long id) {
        return null;
    }
}
