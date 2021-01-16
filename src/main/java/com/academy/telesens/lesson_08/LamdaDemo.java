package com.academy.telesens.lesson_08;

public class LamdaDemo {
    public static void main(String[] args) {
        IntInterface oper1 = (i1, i2) -> i1 + i2;
        System.out.println(oper1.calc(3, 5));
        IntInterface oper2 = (i1, i2) -> i1 * i2;
        System.out.println(oper2.calc(3, 5));


        StringInterface strOper1 = s ->s.toUpperCase();
        StringInterface strOper2 = String::toUpperCase;

        System.out.println(strOper1.oper("ytllo"));
        System.out.println(strOper2.oper("ytllo"));
    }
}
