package com.academy.telesens.lesson_08.home_task;

import com.academy.telesens.CustomeDate.CustomDate;
import com.academy.telesens.CustomeDate.CustomDateTime;

public class Demo5 {
    /*
     Для класса CustomDateTime (разработанном на пред. занятиях) создать лямбда-выражение, кот. для
текущей даты сбрасывает время на 00:00:00
     */
    public static void main(String[] args) {
        CustomDateTime customDateTime = new CustomDateTime();
        customDateTime.setHour(9);
        customDateTime.setMinute(9);
        customDateTime.setSecond(9);
        String dateTime = customDateTime.getFormattedDate();


        ResetTime resetTime = date -> {
            customDateTime.setHour(0);
            customDateTime.setMinute(0);
            customDateTime.setSecond(0);
            //customDateTime.getFormattedDate();
            return customDateTime.getFormattedDate();
        };

        resetTime.resetTodayTime(dateTime);
    }
}
