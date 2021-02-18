package com.academy.telesens.lesson_20;

import org.json.simple.JSONObject;

public class jsonDemo {
    public static void main(String[] args) {
        JSONObject json = new JSONObject();
        json.put("id",1);
        json.put("firstName","testFirstName");
        json.put("lastName","testLastName");
        json.put("age",25);
        json.put("gender", "m");

        String jsonStr = json.toJSONString();
        System.out.println(jsonStr);
    }
}
