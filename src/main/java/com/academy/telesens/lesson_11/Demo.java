package com.academy.telesens.lesson_11;

import com.academy.telesens.Person.Gender;
import com.academy.telesens.Person.Person;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Person p1 = new Person("Иванов", "иван" ,23, Gender.MALE);
        Person p2 = new Person("Петров", "Петр" ,22, Gender.MALE);
        Person p3 = new Person("Сидоров", "Сидор" ,21, Gender.MALE);

        List<Person> list = new ArrayList<>(Arrays.asList(p1,p2,p3));

        list.sort(Comparator.comparing(Person::getFirstName));
        list.sort((o1,o2) -> o1.getLastName().compareTo(o2.getLastName()));

        list.sort((o1,o2)->{
            if (o1.getFirstName().equalsIgnoreCase(o2.getFirstName())){
                if (o1.getLastName().equalsIgnoreCase(o2.getLastName())){
                    return o1.getLastName().compareTo(o2.getLastName());
                } else {
                    return o1.getFirstName().compareTo(o2.getFirstName());
                }
            } else {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
