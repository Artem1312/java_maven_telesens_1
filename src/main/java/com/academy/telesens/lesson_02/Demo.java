package com.academy.telesens.lesson_02;
//переменные. Тпиы данных. базовые конфтрукции.Массивы

public class Demo {

    public static void main(String[] args) {
        //String str = "";
        int  number = 1234;
        System.out.println(number);
        number = Integer.parseInt("123");

        System.out.println(number);
        int maxValue = Integer.MAX_VALUE;
        int maxValue2 = maxValue + 1;
        long maxValue3 = (long)maxValue + 1;
        long maxValue4 = maxValue + 1L;
        double d = 1234.1234;
        //char
        char symbol = 'A'+1; //одиночная кавычка для char
        char ch1 = 65;
        char ch2 = 'r';
        char ch3 = 'r';
        long bigValue = 999988888777776L;
        boolean logic = true;

        System.out.println(maxValue2);
        System.out.println(maxValue3);
        System.out.println(maxValue4);
        System.out.println(d);
        System.out.println(symbol);
        System.out.println(ch1);
        System.out.println(bigValue);
        System.out.println(logic);


        int phoneNumber = 0123; //ноль в начале признак 8-й системы
        System.out.println(phoneNumber);

        //Приведение типов              int можно преобразовать в long (так как int поместиться в long)
        int intValue = 1234;
        long longValue = intValue;
        System.out.println(longValue);

        long longValue1 = 123498765400000L;
        int intValue1 = (int)longValue1;  //операция приведения типа от большего к меньшему (надо явно указывать )
        System.out.println(intValue1);

        var str3 = "wew";
        var num2222=123;


    }
//    String message;
//    //тип - имя
//    // тип переменной не переназначается
//    //примитивные те которые есть в в jave и могут хранить данные
//    //ссылочные те которые можем создать например класс
//    String mes1 = "trust me";


}
