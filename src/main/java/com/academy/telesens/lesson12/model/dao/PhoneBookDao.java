package com.academy.telesens.lesson12.model.dao;

import com.academy.telesens.lesson12.model.PhoneBookRecord;

import java.util.List;

public interface PhoneBookDao {
    boolean save(PhoneBookRecord record);
	boolean remove(PhoneBookRecord record);
	List<PhoneBookRecord> getAll();
	PhoneBookRecord findByKeys(String phoneNumber, Long operatorId);
}
