package com.academy.telesens.CustomeDate;

import java.util.Arrays;

public enum DayOfWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private String ru;

    DayOfWeek(String ru){ this.ru = ru;}

    public String getRu() {
        return ru;
    }

    public void setRu(String ru) {
        this.ru = ru;
    }

    public static void next(int today){
        DayOfWeek[] dayOfWeek1 = DayOfWeek.values();
        if(today+1>=8){
            System.out.println(Arrays.toString(new DayOfWeek[]{dayOfWeek1[0]}));
        } else {
            System.out.println(Arrays.toString(new DayOfWeek[]{dayOfWeek1[today]}));
        }
    }
    public static void before(int today){
        DayOfWeek[] dayOfWeeks2 = DayOfWeek.values();
        if(today == 1){
            System.out.println(Arrays.toString(new DayOfWeek[]{dayOfWeeks2[6]}));
        } else {
            System.out.println(Arrays.toString(new DayOfWeek[]{dayOfWeeks2[today-2]}));
        }

    }
}
