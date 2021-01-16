package com.academy.telesens.lesson_09.from_materials;

public class Calculator {
    public double div(double d1, double d2) throws DivisionByZero {
        if (d2 == 0)
            throw new DivisionByZero();
        return d1/d2;
    }
}

