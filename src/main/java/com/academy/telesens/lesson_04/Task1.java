package com.academy.telesens.lesson_04;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
//        //char[] alphabet = new char[4];
//        char alphabet [] = {'a','b', 'c', 'd'};
//        for(int i =0; i<alphabet.length;i++){
//            System.out.print(alphabet[i]+" ");
//        }

        char first = 'a';
        char last = 'z';
        for(int m=first; m<=last; m++){
            System.out.print(((char)m)+" ");
        }

        System.out.println();

        for(int k=65; k<91; k++){
            System.out.print(((char)k)+" ");
        }

//        Arrays.sort(words);
//        System.out.println(Arrays.toString(words));
        System.out.println("*********************************");
        String[] words1 = {"one","two","thrie"};
        String[] words2 = {"one","two","thrie"};
        System.out.println(Arrays.equals(words1, words2));
        words2[0]= "Hello";
        System.out.println(Arrays.equals(words1, words2));
        System.out.println("*********************************");


    }
}
