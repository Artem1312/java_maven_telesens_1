package com.academy.telesens.lesson_04;

import java.util.Arrays;

public class DemoStr {
    public static void main(String[] args) {
        System.out.println("a"+" "+"b");
        System.out.println('a'+' '+'b');
        System.out.println('a'+" "+'b');
        System.out.println("**********Пример 1************");
        String hello = "Hello "+"world!!!";
        System.out.println(hello.length());     //длина строки
        System.out.println(hello.charAt(2));    //взятие по индексу(индексация от 0)

        String world = hello.substring(6);      //вытягиваем часть строки, в данном случае от индекса от 6 до конца строки
        System.out.println(world);

        String world2 = hello.substring(6, 11); //вытягиваем часть строки, в данном случае от индекса от 6 до 11(последний индекс не считывается)
        System.out.println(world2);

        System.out.println("**********Пример 2************");
        String item = "id_12345678_vtr_234";
        int firstIndex = item.indexOf("_");
        int lastIndex = item.indexOf("_", 5);
        System.out.println(firstIndex);
        System.out.println(lastIndex);
        String numberPart = item.substring(firstIndex + 1, lastIndex);
        System.out.println(numberPart);

        int  index = "12312fddfg".indexOf("df");
        System.out.println(index);

        System.out.println("***********Савнение строк*************");

        //String str1 = "Hello";
        String str1 = new String("Hello");
        String str2 = "He"+"llo";
        String str3 = "hello world";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        //System.out.println(str1 == str2); //так сравнивать строки нельзя
        //System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str2));
        System.out.println("***************");
        Integer m1 = 200;
        Integer m2 = 200;
        Integer m3 = 100;
        Integer m4 = 99;

        System.out.println(m1 == m2);
        System.out.println(m3 == m4);

        System.out.println(m1.equals(m2));
        System.out.println("***********Замена строки*************");
        String msg = "   Hello world!!!    ";
        String changedMsg = msg.replaceAll("!!!", "!");
        System.out.println(msg);
        System.out.println(changedMsg);

        System.out.println(msg.toLowerCase());
        System.out.println(msg.toUpperCase());

        System.out.println("'"+msg+"'");
        System.out.println("'"+msg.trim()+"'"); //убираем начальные и кончные пробелы

        String demoString = "One,Two,Three";
        String[] parts = demoString.split(",");
        String tmp = Arrays.toString(parts);
        System.out.println(Arrays.toString(parts));
        String joined = tmp.replaceAll("\\[","").replaceAll("\\]", "")
                .replaceAll(" ","");
        System.out.println(joined);
    }
}
