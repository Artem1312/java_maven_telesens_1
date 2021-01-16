package com.academy.telesens.Person;

import java.util.Objects;

public class Person {
    //Gender gender = new Gender();
    protected String firstName;
    protected String lastName;
    protected int age;
    protected char gender;
//    private String firstName;
//    private String lastName;
//    private int age;


    public Person(){

    }

    public Person (String firstName, String lastName, int age, char gender) {
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

    public char getGender(){
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

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void set(String firstName, String lastName, int age, char gender){
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
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
