package com.academy.telesens.Person.Demo;

import com.academy.telesens.Person.*;

import java.util.Arrays;

public class InterfaceDemo {
    public static void main(String[] args) {
//        Button button = new Button("Login");
//        Component button2 = new Button();
//        VisualComponent label = new Label();
//        VisualComponent button3 = new Button();
        Person person = new Person();
        Boxer boxer = new Boxer();
        Choreograph choreograph = new Choreograph();
        QualityAssurense qualityAssurense = new QualityAssurense();
        Genious genious = new Genious();
        Programmer programmer = new Programmer();
        Tester tester = new Tester();

        boxer.fight();
        choreograph.dance();
        qualityAssurense.coding();

        Object[] arr = {boxer,choreograph, qualityAssurense, genious};
        System.out.println("*****************");

        for(int i =0; i< arr.length; i++){
            if(arr[i] instanceof Dancer){
                ((Dancer)arr[i]).dance();
            }
        }
        Coder[] arr2 = {programmer, tester};
        for (int j = 0; j < arr2.length; j++) {
            //((QA)arr2[j]).coding();
            arr2[j].coding();
        }

        Person[] people = {new Boxer(), new Choreograph(), new Programmer(), new QualityAssurense()};
        System.out.println(Arrays.toString(people));

    }
}
