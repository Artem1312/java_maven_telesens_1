package com.academy.telesens.Operator;

import com.academy.telesens.Person.Person;

public class Subscriber  extends Person {
    private String phoneNumber = null;
    private Operator operator;
    private String firstName;
    private String lastName;
    private char gender = 'm';
    private int age = 20;

    //констркутор
    public Subscriber(){

    }

    public Subscriber(String firstName,
                       String lastName,
                       Integer age,
                       Character gender,
                       String phoneNumber,
                       Operator operator){

        super(firstName,lastName,age,gender); // конструктор базового класа должна быть первой иструкцией
        //setFirstName(firstName); //1 способ
        this.phoneNumber = phoneNumber;
        this.operator = operator;
    }

    //set/get
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Operator getOperator() {
        return operator;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    //метод with (для красоты)
    public Subscriber withFirstName(String firstName){
        super.firstName = firstName;
        return this;
    }

    public Subscriber withLastName(String lastName){
        super.lastName = lastName;
        return this;
    }

    public Subscriber withAge(int age) {
        super.age = age;
        return this;
    }

    @Override
    public String getProfile(){
        String info = String.format("Имя: %s, Фамилия: %s Возраст: %d Пол: %s номер %s", firstName,lastName, age, gender,phoneNumber);
        System.out.println(info);
        return String.format("Имя: %s, Фамилия: %s Возраст: %d Пол: %s номер %s", firstName,lastName, age, gender,phoneNumber); //, operator.getName());
        //return (super.getProfile() + String.format(" PhoneNumber: %s\n Operator: %s\n",phoneNumber, operator.getName()));
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", operator=" + operator +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
