package com.academy.telesens.lesson10.home_task;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Demo {
    /*

	g) Перевести все первые символы в верхний регистр
	h) Вывести все имена, начинающиеся на букву A

	j) Удалить из списка все имена кроме Kate и Helen
     */


    public static void main(String[] args) {
        String[] names = {"Peter", "Helen", "Andry", "Abdel", "Kate", "Veronica", "Leonid", "Alex", "max"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
        System.out.println(list);

        list.add("Philip");
        list.add("Joseph");
        list.add("Leon");
        System.out.println(list);

        list.remove("Veronica");
        list.remove("Leonid");
        System.out.println(list);

        list.set(list.indexOf("Helen"),"Elizabet");
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
        list.sort((s1,s2)->s2.compareTo(s1));
        System.out.println(list);

        //list.stream().map(String::toUpperCase).peek(String::toUpperCase).peek(System.out::println).collect(Collectors.toList());
        //System.out.println(list);

        System.out.println(list.contains("Andry"));



        //
        //List<String> names = new ArrayList<>(Arrays.asList())
    }
}
