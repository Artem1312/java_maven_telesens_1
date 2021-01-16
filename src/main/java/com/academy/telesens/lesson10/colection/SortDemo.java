package com.academy.telesens.lesson10.colection;

import com.academy.telesens.Person.Gender;
import com.academy.telesens.Person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SortDemo {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("three");

        List<String> list2 = new ArrayList<>();
        list2.add("three");
        list2.add("two");
        list2.add("one");

        list1.sort(String::compareTo);
        list2.sort(String::compareTo);

        System.out.println(list1.equals(list2));

        List<Person> people = new ArrayList<>();
        people.add(new Person("Vasa", "Ivanov", 25, 'm'));
        people.add(new Person("sidorov", "Ivanov", 25, 'm'));
        people.add(new Person("helen", "petrovna", 25, 'f'));

//        //people.sort(new PersonComparator());
//        people.sort((o1,o2)-> {
//            if (o1.getAge() < o2.getAge())
//                return -1;
////            if (o1.getAge() = o2.getAge())
////                return 0;
//            if (o1.getAge() > o2.getAge())
//                return 1;
//        });
//        System.out.println(people);
    }
}

