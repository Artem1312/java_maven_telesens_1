package com.academy.telesens.lesson_09;

import com.academy.telesens.Person.InvalidAge;
import com.academy.telesens.Person.Person;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person();

        try {
            person.setAge(-5);
            person.setAge(150);
            person.setAge(25);
        } catch (InvalidAge e) {
            System.out.println("Не существующий возраст ");
            e.getLocalizedMessage();
            e.printStackTrace();
        }


        System.out.println("Finish");



        double d1 =1;
        double d2 =0;


        int i1=1;
        int i2=0;
        try {
            double result = div(d1, d2);
            System.out.println(result);
        } catch (DivisionByZeroException e){
            System.out.println("Error");
        }

        try {
            int result = div(1,0);  //cntr alt t
            System.out.println(result);
        } catch (DivisionByZeroException e) {
            System.out.println("comon error");
            System.out.println("Deteils "+ e.getLocalizedMessage());
            e.printStackTrace();
        }
        //System.out.println(i1/i2);
    }

    public static double div(double d1, double d2) throws DivisionByZeroException{
        if (d2 ==0)
            throw new DivisionByZeroException();
            return d1 / d2;

    }

    public static int div(int i1, int i2) throws DivisionByZeroException{

        return i1/i2;
    }
}
