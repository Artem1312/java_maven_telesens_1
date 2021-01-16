package com.academy.telesens.lesson_05;

public class Demo3 {
    public static void main(String[] args) {
        //Demo3 sdf;
        Integer nums = 123;
        String str ="efddf";
        Buttn btn = new Buttn();
        Buttn btn2 = null;
        System.out.println(btn);
        System.out.println(btn2);

        //btn.size = 123;
        btn.text = "Login";
        //System.out.println("btn.size "+ btn.size);
        System.out.println("************************");
        btn.printnfo();
        btn.setText("Login");
        btn.printnfo();

        Buttn btn4 = new Buttn();
        btn4.printnfo();
    }
}
