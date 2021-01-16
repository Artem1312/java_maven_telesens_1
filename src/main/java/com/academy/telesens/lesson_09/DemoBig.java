package com.academy.telesens.lesson_09;

import java.math.BigInteger;

public class DemoBig {
    private static Object BigInteger;

    public static void main(String[] args) {
        BigInteger number1 = new BigInteger("21312312312312123123123213123123123");
        System.out.println(number1);
        BigInteger result = number1.add(new BigInteger("12"));
        System.out.println(number1);
    }
}
