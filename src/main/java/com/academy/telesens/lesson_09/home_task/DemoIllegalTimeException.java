package com.academy.telesens.lesson_09.home_task;

import com.academy.telesens.CustomeDate.CustomDateTime;

public class DemoIllegalTimeException {

    public static void main(String[] args) {
        CustomDateTime customDateTime1 = new CustomDateTime(12,12,12);
        CustomDateTime customDateTime2 = new CustomDateTime(23,1,1);
        CustomDateTime customDateTime3 = new CustomDateTime(0,0,0);
        CustomDateTime customDateTime4 = new CustomDateTime(23,59,59);
        CustomDateTime customDateTime5 = new CustomDateTime(12,-12,12);// отрицательный минуты не суще-ет
        CustomDateTime customDateTime6 = new CustomDateTime(23,1,60);// большое значение для секунды
        CustomDateTime customDateTime7 = new CustomDateTime(24,0,0);// большое значение для часа
        CustomDateTime customDateTime8 = new CustomDateTime(23,60,0);// большое значение для минуты

        System.out.println("\nПозитивные кейсы");
        customDateTime1.getFormattedDate();
        customDateTime2.getFormattedDate();
        customDateTime3.getFormattedDate();
        customDateTime4.getFormattedDate();

        System.out.println("\nНегативные кейсы");
        customDateTime5.getFormattedDate();
        customDateTime6.getFormattedDate();
        customDateTime7.getFormattedDate();
        customDateTime8.getFormattedDate();
    }
}
