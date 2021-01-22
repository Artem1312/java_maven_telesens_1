package com.academy.telesens.lesson12.model.dao;

import com.academy.telesens.lesson12.model.Operator;

import java.util.List;

public interface OperatorDao {
    boolean save(Operator operator);
	boolean remove(Operator operator);
	List<Operator> getAll();
	Operator findById(long id);
}
