package com.academy.telesens.CustomeDate.Demo;

import com.academy.telesens.CustomeDate.DayOfWeek;

import java.util.Arrays;

public class DayOfWeekDemo {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        DayOfWeek[] dayOfWeek1 = DayOfWeek.values();
        dayOfWeek.ordinal();
        System.out.println(Arrays.toString(dayOfWeek1));
        dayOfWeek.next(0);
        dayOfWeek.before(1);
        //dayOfWeek.name();

        System.out.println("***********");
        for(DayOfWeek dayOfWeek2 : DayOfWeek.values()){
            System.out.println("toString(): "+dayOfWeek2.toString());
            System.out.println("ordinal(): "+dayOfWeek2.ordinal());
            System.out.println("name(): "+dayOfWeek2.name());
        }

    }
}
