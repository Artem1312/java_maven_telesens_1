package com.academy.telesens.lesson_12.model.dao.jdbc;

import com.academy.telesens.lesson_12.model.Operator;
import com.academy.telesens.lesson_12.model.dao.OperatorDao;

import java.util.List;

public class OperatorDaoImpl implements OperatorDao {

    @Override
    public boolean save(Operator operator) {
        return false;
    }

    @Override
    public boolean remove(Operator operator) {
        return false;
    }

    @Override
    public List<Operator> getAll() {
        return null;
    }

    @Override
    public Operator findById(long id) {
        return null;
    }
}
