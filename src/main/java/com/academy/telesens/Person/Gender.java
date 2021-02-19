package com.academy.telesens.Person;

import org.openqa.selenium.InvalidArgumentException;

public enum Gender {
    MALE("Мужчина"),  //0
    FEMALE("Женщина"); //1

    private String ru;

    Gender(String ru) {
        this.ru = ru;
    }

    public String getRu() {
        return ru;
    }
    public void saySomething() {
        if (this == MALE)
            System.out.println("Я мужик");
        else
            System.out.println("Я за мужика");
    }

    public static Gender parse(String g) {
        if (g.equals("m"))
            return MALE;

        if (g.equals("f"))
            return FEMALE;

        throw new InvalidArgumentException("Unknown gender value " + g);
    }
}