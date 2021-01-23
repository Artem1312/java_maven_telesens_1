package com.academy.telesens.lesson_11.home_task;

import com.academy.telesens.Person.Gender;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        Object[][] user = {
                {1,"Васильев", "Иван", Gender.MALE, 23, "380630025465", "Life"},
                {1,"Васильев", "Иван", Gender.MALE, 23, "380630025465", "Life"}
        };

        ArrayList<Object> date = new ArrayList<>(Arrays.asList( user));

        //System.out.println(ArrayUtils.toString(date));
        date.forEach(System.out::println);
        System.out.println(date);

        for (Object ob: user){
            System.out.println(ob);
        }

        for (int i = 0; i < date.size(); i++) {
            System.out.println(date.get(i));
        }

        System.out.println(Arrays.deepToString(date.toArray()));

    }
}
