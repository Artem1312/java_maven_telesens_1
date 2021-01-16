package com.academy.telesens.Person;

public class Genious extends Person implements Dancer, Fighter, Coder {

    public void fight(){
        System.out.println("I can fight");
    }
    public void coding(){ System.out.println("I can coding"); }
    public void dance(){
        System.out.println("I can dance");
    }

    @Override
    public String getProfile() {
        return super.getProfile();
    }
}
