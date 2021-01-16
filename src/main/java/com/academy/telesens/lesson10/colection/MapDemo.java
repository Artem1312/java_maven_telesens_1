package com.academy.telesens.lesson10.colection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"ten");
        map.put(3,"uio");

        System.out.println(map);
        map.put(1, "wew");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.get(4));
        System.out.println(map.size());
    }
}
