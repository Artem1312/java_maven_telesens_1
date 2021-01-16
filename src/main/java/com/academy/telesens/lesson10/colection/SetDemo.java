package com.academy.telesens.lesson10.colection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(14);
        set.add(14);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(5);
        integerList.add(3);

        Set<Integer> integerSet = new HashSet<>(integerList);

        System.out.println(integerSet);
    }
}
