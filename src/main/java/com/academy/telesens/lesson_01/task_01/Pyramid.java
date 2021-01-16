package com.academy.telesens.lesson_01.task_01;

//public class pyramid {
//    public static void main(String[] args){
//        System.out.println("*");
//        System.out.println("**");
//        System.out.println("***");
//        System.out.println("****");
//        System.out.println("*****");
//        System.out.println("******");
//    }
//}
public class Pyramid {
    public static void main(String[] args){
        String text = "";
        int n = 6;
        for(int i=0;i<n;i++){
            text+="*";
            System.out.println(text);
        }
    }
}
