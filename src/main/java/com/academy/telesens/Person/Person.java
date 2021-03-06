package com.academy.telesens.Person;

import java.util.Objects;

public class Person {
    //Gender gender = new Gender();
    protected String firstName;
    protected String lastName;
    protected Integer age;
    protected Gender gender;
//    private String firstName;
//    private String lastName;
//    private int age;

    // Конструкторы
    public Person(){
    }

    public Person (String firstName, String lastName, int age, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public Gender getGender(){
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) throws  InvalidAge{
        if(age<=0)
            throw new InvalidAge();
        this.age = age;
    }


//    public static int invalidAge(int age) throws InvalidAge{
//        if(age<=0)
//            throw new InvalidAge();
//        return age;
//    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void set(String firstName, String lastName, int age, Gender gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public Person(String firstName, String lastName, Integer age, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    // Другие методы
    public String getProfile(){
        return String.format(" First name: %s\n Last name: %s\n Age: %s\n Gender: %s\n",
                firstName, lastName, age, gender);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return firstName.equals(person.firstName) &&
                lastName.equals(person.lastName) &&
                age.equals(person.age) &&
                gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}