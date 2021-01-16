package com.academy.telesens.lesson10.generic;

import java.lang.reflect.Field;

public class Pair <U,V>{
//    Pair first;
//    Pair second;
//
//    public void setFirst(Pair first) {
//        this.first = first;
//    }
//
//    public void setSecond(Pair second) {
//        this.second = second;
//    }
//
//    public Pair getFirst() {
//        return first;
//    }
//
//    public Pair getSecond() {
//        return second;
//    }
//
//    public Pair(Pair first, Pair second) {
//        this.first = first;
//        this.second = second;
//    }
    private U first;
    private V second;

    public U getFirst() {
        return first;
    }

    public void setFirst(U first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }
}
