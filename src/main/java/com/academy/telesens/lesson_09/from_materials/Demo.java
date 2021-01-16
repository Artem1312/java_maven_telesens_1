package com.academy.telesens.lesson_09.from_materials;

import java.math.BigInteger;

public class Demo {
    public static void main(String[] args) {
        double x = 1;
        double y = 0;
        Calculator calculator = new Calculator();
        double z = 0;
        try {
            z = calculator.div(x,y);
        } catch (DivisionByZero exc) {
            System.err.println("Error division");
        } catch (Exception e) {
            System.err.println("Unknown error");
        }

        System.out.println("******************");
        BigInteger x1 = new BigInteger("1");
        BigInteger x2 = new BigInteger("3");

        System.out.println("x1 = "+ x1);
        System.out.println("x2 = "+ x2);
        System.out.println("x1 + x2 = "+ x1.add(x2));
        System.out.println("x1 - x2 = "+ x1.subtract(x2));
        System.out.println("x1 / x2 = "+ x1.divide(x2));
        System.out.println("x1 * x2 = "+ x1.multiply(x2));
        System.out.println("x1 % x2 = "+ x1.remainder(x2));
        System.out.println("*******************");
        System.out.println(x1.abs());
        System.out.println(x1.add(x1));
        System.out.println(x1.divideAndRemainder(x1));
        System.out.println(x1.gcd(x2));
        System.out.println(x1.max(x2));
        System.out.println(x1.min(x2));
        System.out.println(x1.mod(x2));
        System.out.println(x1.modInverse(x2));
        System.out.println(x1.modPow(x2,x1));
        System.out.println(x1.negate());
        System.out.println(x1.pow(2));
        System.out.println(x1.signum());
        BigInteger m = BigInteger.valueOf(Integer.MAX_VALUE);
        BigInteger n = m.add(BigInteger.ONE);
        System.out.println(n);

    }
}
