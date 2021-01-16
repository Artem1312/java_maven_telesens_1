package com.academy.telesens.CustomeDate.Demo;

import com.academy.telesens.CustomeDate.CustomDateTime;

public class Demo2 {
    public static void main(String[] args) {
        CustomDateTime customDateTime = new CustomDateTime();
        customDateTime.setSecond(57);
        customDateTime.setMinute(59);
        customDateTime.setHour(23);
        customDateTime.setDay(29);
        customDateTime.setMonth(2);
        customDateTime.setYear(2019);

        customDateTime.getFormattedDate();
        customDateTime.addSeconds(1);
        customDateTime.getFormattedDate();
        customDateTime.addSeconds(1);
        customDateTime.getFormattedDate();
        customDateTime.addSeconds(1);
        customDateTime.getFormattedDate();
        customDateTime.addSeconds(1);
        customDateTime.getFormattedDate();
        customDateTime.addSeconds(1);
        customDateTime.getFormattedDate();
        customDateTime.addSeconds(1);
        customDateTime.getFormattedDate();
        customDateTime.addSeconds(1);
        customDateTime.getFormattedDate();
        customDateTime.addSeconds(1);
        customDateTime.getFormattedDate();
        customDateTime.addSeconds(1);
        customDateTime.getFormattedDate();
        customDateTime.addSeconds(1);
        customDateTime.getFormattedDate();


    }
}
