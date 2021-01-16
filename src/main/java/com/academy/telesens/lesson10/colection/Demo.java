package com.academy.telesens.lesson10.colection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("one");
        list.add("two");

        System.out.println(list);

//        for (int i = 0; i < 100; i++) {
//            list.add("others");
//        }
        System.out.println(list);
        String el = list.get(1);
        int size = list.size();
        System.out.println(el);
        System.out.println(size);
        System.out.println(list.contains("two"));
        System.out.println(list.contains("two"));
        //list.remove(2);
        list.remove("hello");
        //list.removeAll()
        ArrayList<Integer> listInt = new ArrayList<>(
                Arrays.asList(1,2,3,4,3,4,5,8,3,1));

        System.out.println(listInt);
        listInt.remove((Integer)1);

        listInt.sort((n1,n2) -> n1.compareTo(n2));
        listInt.sort(Integer::compareTo);
        System.out.println(listInt);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("helen");
        list2.add("anna");
        System.out.println(list2);
        list2.addAll(list);

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
        //sorting
        list2.sort(String::compareTo);
        System.out.println(list2);

        //
    }
}
