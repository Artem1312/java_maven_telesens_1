package com.academy.telesens.lesson_05;

public class Demo {
    public static void main(String[] args) {
        String palindrom = "qwerewq";
        String notPalindrom = "Hello world!";
        System.out.println(isPalindrom(palindrom));
        System.out.println();
        System.out.println(countSubs("sdfssd java jacsfsd javajavajava fs", "java"));
    }

    public static boolean isPalindrom(String testString) {
        for(int i=0, k=testString.length()-1; i<k; i++, k--){
            if(testString.charAt(i)!= testString.charAt(k)){
                return false;
            }
        }
        return true;
    }
    public static int countSubs(String origin, String subs){
        int count =0;
        int index =0;
        while ((index = origin.indexOf(subs, index)) != -1){
            count++;
            index = index + subs.length();


        }
        return count;
    }
}
