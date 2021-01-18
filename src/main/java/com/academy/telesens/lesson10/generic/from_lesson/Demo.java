package com.academy.telesens.lesson10.generic.from_lesson;

public class Demo {
    public static void main(String[] args) {
        Generic<String, Integer> generic = new Generic<>();
        //generic.setFirstElement();

        Integer n = 5;
        NumericMath<Integer> iob = new NumericMath<Integer>(n);
        System.out.println("Исходное число iob: "+n);
        System.out.println("обратная величина iob: "+ iob.reciprocal());
        System.out.println("дробная часть iob: "+iob.fraction());
        System.out.println();
        Double d = 5.25;
        NumericMath<Double> dob = new NumericMath<Double>(d);
        System.out.println("Исходное число iob: "+d);
        System.out.println("обратная величина iob: "+dob.reciprocal());
        System.out.println("дробная часть iob: "+dob.fraction());
    }

}
