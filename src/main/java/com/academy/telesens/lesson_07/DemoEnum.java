package com.academy.telesens.lesson_07;

import com.academy.telesens.Person.Gender;

import java.util.Arrays;

public class DemoEnum {
    public static void main(String[] args) {
        Gender gender = Gender.MALE;

        if(gender == Gender.MALE){
            System.out.println("Мужщина");
        } else {
            System.out.println("Женщина");
        }

        switch (gender){
            case MALE:
                System.out.println("Мужщина");
                break;
            case FEMALE:
                System.out.println("Женщина");
                break;
        }

        //
        System.out.println("number of gender ");
        System.out.println(Gender.FEMALE.ordinal());
        System.out.println(Gender.MALE.ordinal());
        System.out.println("Array");
        Gender.values();
        Gender[] genders = Gender.values();
        System.out.println(Arrays.toString(genders));

        System.out.println("enum from sstring");
        Gender gender2 = Gender.valueOf("FEMALE");
        System.out.println(gender2);
        System.out.println(gender2.getRu());

    }
}
