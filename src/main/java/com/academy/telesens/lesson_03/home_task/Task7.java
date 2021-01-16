package com.academy.telesens.lesson_03.home_task;

public class Task7 {
    public static void main(String[] args) {
        int [] array = new int[]{3, 4, 9, 10, 34, 239, 8, 0, -3, 19, 17};
        System.out.println("Выводим массив через for:");
        for(int i =0;i<array.length;i++){
            if(i == 0){
                System.out.print("["+array[i]+", ");
            } else if(i>0 && i<array.length-1){
                System.out.print(array[i]+", ");
            } else {
                System.out.print(array[i]+"]\n");
            }
        }
        System.out.println("Выводим массив через while:");
        int k = 0;
        while (k < array.length){
            if(k == 0){
                System.out.print("["+array[k]+", ");
            } else if(k>0 && k<array.length-1){
                System.out.print(array[k]+", ");
            } else {
                System.out.print(array[k]+"]\n");
            }
            k++;
        }
    }
}
