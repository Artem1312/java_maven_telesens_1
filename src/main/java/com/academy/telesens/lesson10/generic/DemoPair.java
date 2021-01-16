package com.academy.telesens.lesson10.generic;

import com.academy.telesens.Person.Person;

public class DemoPair {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(10, "String");
        int n = pair.getFirst();
        String str = pair.getSecond();
        System.out.println("Pair" + n +"-> "+ str);

        Pair<String, Integer> pair2 = new Pair<>("String", 10);
        int n2 = pair2.getSecond();
        System.out.println("Pair2 " + n +"-> "+ str);

        Pair<Integer, Integer> pair1 = new Pair<>(5,10);



        Person person = new Person();
        Pair<Integer, Person> pair3 = new Pair<>(5, person);
        System.out.println("Pair3 " + n +"-> "+ str);

        Pair<Integer, Pair<Integer, Person>> crazyP = new Pair<>(5,pair3);

        print(1,"hello");
        double result = sun(1, 3);
        double result2 = sun(1.3, 3);
        //double result3 = sun(1, "3.0");
        System.out.println(result);
        System.out.println(result2);
       // System.out.println(result3);

        Pair<Object, Integer> pair4 = new Pair<>("dsf",23);
        //someMethod(pair);
        someMethod(pair4);

    }
    public static <U,V> void print(U arg1, V arg2){
        System.out.println("first "+arg1+"second "+arg2);
    }

    public static <U extends Number, V extends Number> double sun (U arg1, V arg2){
        return arg1.doubleValue() + arg2.doubleValue();
    }

    public static void someMethod (Pair<? super Number,?> pair){
        Object first = pair.getFirst();
        Object second = pair.getSecond();
        System.out.println(first + ":"+second);
    }
}
