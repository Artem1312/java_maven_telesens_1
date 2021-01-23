package com.academy.telesens.lesson_10.home_task;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

//        a) создать список целых чисел
        ArrayList<Integer> listInt = new ArrayList<>();

//        b) наполнить список случайными целыми числами от 1 до 100 (размер списка 20 элементов)
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            Integer k = Math.abs(random.nextInt() %100)+1;
            listInt.add(k);
        }

//        c) вывести список на экран
        System.out.println(listInt);

//        d) вывести минимальное, максимально значения
        System.out.println(listInt.stream().min(Integer::compareTo).get());
        System.out.println(listInt.stream().max(Integer::compareTo).get());

//        e) вывести сумму чисел на экран
        System.out.println(listInt.stream().mapToInt(Integer::intValue).sum());

//        f) найти наиболее часто встречающееся число, вывести это число и кол-во повторений на экран
//                (если чисел несколько с одинаковой частотой повторений, то вывести минимальное из них)
        //System.out.println(listInt.stream().count());
    }
}
