package com.academy.telesens.lesson_12.model.dao.jdbc;

import com.academy.telesens.lesson_12.model.PhoneBookRecord;
import com.academy.telesens.lesson_12.model.dao.PhoneBookDao;

import java.util.List;

public class PhoneBookDaoImpl implements PhoneBookDao {
    @Override
    public boolean save(PhoneBookRecord record) {
        return false;
    }

    @Override
    public boolean remove(PhoneBookRecord record) {
        return false;
    }

    @Override
    public List<PhoneBookRecord> getAll() {
        return null;
    }

    @Override
    public PhoneBookRecord findByKeys(String phoneNumber, Long operatorId) {
        return null;
    }
}
