package com.academy.telesens.lesson_10.generic.from_lesson;

public class NumericMath<T extends Number> {
    private T number;
    public NumericMath(T number){
        this.number = number;
    }
    public double reciprocal(){
        return 1/number.doubleValue();
    }
    public double fraction(){
        return number.doubleValue() - number.intValue();
    }
}
