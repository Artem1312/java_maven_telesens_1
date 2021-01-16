package com.academy.telesens.lesson_04;

public class Demo {
    public static void main(String[] args) {
        int n1 = 12;
        Integer n2 =12;

        long l1 = 123L;
        Long l2 = 123L;

        l2 = l1;
        l1 = l2;
        l2 = Long.valueOf(l1); // длинная запись
        //автоматическое развертывание из примитивного в сылочный

        //над примитивными
        l1 =n1;
        n1 =(int)l1;
        //над объбертками
        //расширяем тип
        l2 = n2.longValue();
        l2 =(long)n2;
        // сужаем тип
        n2 = l2.intValue();

        //
        System.out.println("****Character*****");
        Character symb1 = 'a';
        Character symb2 ='5';
        System.out.println(Character.isAlphabetic(symb1));
        System.out.println(Character.isAlphabetic(symb2));
        System.out.println(Character.isDigit(symb2));
        System.out.println(Character.isDigit(symb1));

    }
}
