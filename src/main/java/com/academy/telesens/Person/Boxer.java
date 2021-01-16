package com.academy.telesens.Person;

public class Boxer extends Person implements Fighter {
    @Override
    public String getProfile() {
        return super.getProfile();
    }

    public void fight(){
        System.out.println("I can fight");
    }

}
