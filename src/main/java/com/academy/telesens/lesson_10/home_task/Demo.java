package com.academy.telesens.lesson_10.home_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        // дан массив
        String[] names = {"Peter", "Helen", "Andry", "Abdel", "Kate", "Veronica", "Leonid", "Alex", "max"};

        //	a) Создать список List из элементов массива и вывести на экран
        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
        System.out.println(list);

        //  b) Добавить 3 новых имени в список (Philip, Joseph, Leon) и вывести весь список на экран
        list.add("Philip");
        list.add("Joseph");
        list.add("Leon");
        System.out.println(list);

        //  c) Удалить из списка все имена: Veronica, Leonid и вывести на экран
        list.remove("Veronica");
        list.remove("Leonid");
        System.out.println(list);

        // d) Поменять имя Helen на Elizabet
        list.set(list.indexOf("Helen"),"Elizabet");
        System.out.println(list);

        //e) Отсортировать имена по алфавиту и вывести на экран
        Collections.sort(list);
        System.out.println(list);

        //f) Отсортировать имена в обратном порядке и вывести имена на экран
        Collections.reverse(list);
        System.out.println(list);
        list.sort((s1,s2)->s2.compareTo(s1));
        System.out.println(list);

        //  g) Перевести все первые символы в верхний регистр
        //list.stream().map(String::toUpperCase).peek(String::toUpperCase).peek(System.out::println).collect(Collectors.toList());
        for (String el : list) {
            //System.out.println( el.substring(0,1).toUpperCase()+el.substring(1) );
            list.set(list.indexOf(el) ,el.substring(0,1).toUpperCase()+el.substring(1));
        }
        System.out.println(list);

        //  h) Вывести все имена, начинающиеся на букву A
        for (String el: list){
            if( el.substring(0,1).equals("A")){
                System.out.println(el);
            }
        }

        //  i) Проверить, содержит ли список имя Andry
        System.out.println(list.contains("Andry"));

        //	j) Удалить из списка все имена кроме Kate и Helen
//        for (String el: list) {
//            if (!(el.equals("Kate")) || !(el.equals("Helen"))){
//                list.remove(el);
//            }
//        }
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Kate", "Helen"));
        list.retainAll(list2);
        System.out.println(list);
    }
}
