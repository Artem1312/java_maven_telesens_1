package com.academy.telesens.Person.Demo;

import com.academy.telesens.Person.Person;

public class DemoPerson {
    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("Artem");
        person.setLastName("Apukhtin");
        person.setAge(29);
        person.setGender('m');

        person.getProfile();
    }
}
