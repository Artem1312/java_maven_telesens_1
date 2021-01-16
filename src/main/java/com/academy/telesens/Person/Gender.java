package com.academy.telesens.Person;

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
    public void saySomething(){
        if(this == MALE){
            System.out.println("Я мучина");
        }
    }

}
