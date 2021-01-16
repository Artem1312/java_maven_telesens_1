package com.academy.telesens.lesson_03.home_task;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
//          1
//         121
//        12321
//         121
//          1
        */
        System.out.print("Введите размерность: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = n+n-1;
        int[] line = new int[m];
        for (int y=0;y<m;y++){
            if(y<n) {
                line[y] = y+1;
            }else{
                line[y] = y-((y-n)*2)-1;
            }
        }

        //контрольная проверка
        //System.out.println(Arrays.toString(line));

        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
//                int k =0;
//                //System.out.print('*');
//                k=k-m+i+j+2;
//                if(k<=0){
//                    System.out.print('*');
//                    k++;
//                }else{
//                    System.out.print(k);
//                    k++;
//                }
                if((j>n-1-i)&&(j<n+i-1)){
                    System.out.print(line[j]);
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
