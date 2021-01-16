package com.academy.telesens.lesson_04.home_task;

import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        /*
        Реализовать программу, которая: в диалоговом режиме запрашивает размер массива,
        заполняет массив случайными числами (целые числа), меняет порядок элементов массива
	    сортирует массив, выводит исходный массив, выводит перевернутый массив, выводит отсортированный массив
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите размер массива: ");
        int n = scanner.nextInt();
        int[] arr = createArr(n);
        showArr(arr);
        showReversArr(arr, n);
        showSortArr(arr);
    }

    public static int[] createArr(Integer n) {
        Random random = new Random();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    public static void showArr(int[] arr) {
        System.out.println("Начальный массив: \t\t\t"+ Arrays.toString(arr));
    }

    public static void showReversArr(int[] arr, int n) {
        int[] reversArr = new int[n];
        int k=n-1;
        for(int i=0;i<arr.length;i++){
            reversArr[i]=arr[k];
            k--;
        }
        System.out.println("Перевернутый массив: \t\t"+Arrays.toString(reversArr));
    }

    public static void showSortArr(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Отсортированный массив: \t"+ Arrays.toString(arr));
    }
}
