package com.academy.telesens.lesson_04.home_task;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        /*
        Реализовать программу, которая: в диалоговом режиме запрашивает размер двумерного массива в диалоговом
        режиме считывает элементы массива (дробные трехзначные числа с двумя знаками после запятой) выводите
        массив в виде отформатированном виде (оставляя два знака после запятой), напр. для массива размером 3:

		|3.14   2.7    124.45|
		|15.55  112.76 4.45  |
		|5      0      -66   |

	- определяет и выводит на экран:
		-- минимальный элемент (-66)
		-- максимальный (124.45)
		-- номер строки, сумма элементов которой максимальна (в данном примере 2-ая строка)
		-- номер строки, сумма которых минимальна (в данном примере 3)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите какого размера создать массив");
        System.out.print("Введите количество столбцов: ");
        int n = scanner.nextInt();
        System.out.print("Введите количество рядов: ");
        int m = scanner.nextInt();

        double[][] arr = new double[n][m];

        System.out.println("Заполните массив: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = scanner.nextDouble();
            }
        }

        //System.out.println(Arrays.deepToString(arr));
        //печатаем отформатированный массив
        for(int v=0;v<n;v++){
            System.out.print("|");
            for(int w=0;w<m;w++){
                if(w==0){
                    System.out.print(String.format("%5.2f", arr[v][w])+"\t");
                } else if (w>0 && w<m-1){
                    System.out.print(String.format("%5.2f", arr[v][w])+"\t");
                } else{
                    System.out.print(String.format("%5.2f", arr[v][w]));
                }
            }
            System.out.print("|");
            System.out.println();
        }

        double min = arr[0][0], max = arr[0][0], tempSum = 0;
        int numLineMaxSum=0, numLineMinSum = 0;
        //проходимся по первому ряду и принимаем значение сумы элементов за максимальное и минимальное значения
        for(int y=0;y<m;y++){
            tempSum+= arr[0][y];
        }
        double sumLineMax=tempSum, sumLineMin=tempSum;
        //целиком проходимся по матрице
        for(int a=0;a<n;a++){
            tempSum=0;              //обнуляем временную переменую
            for(int b=0;b<m;b++){
                if(arr[a][b] < min ){
                    min = arr[a][b];
                }
                if(arr[a][b] > max ){
                    max = arr[a][b];
                }
                tempSum+=arr[a][b];
            }
            if(tempSum > sumLineMax){
                sumLineMax=tempSum;
                numLineMaxSum=a;
            }
            if(tempSum < sumLineMin){
                sumLineMin=tempSum;
                numLineMinSum=a;
            }
        }
        System.out.println("Минимальный элемент массива: "+min);
        System.out.println("Максимальный элемент массива: "+max);
        System.out.println("Максимальная сумма строки "+ sumLineMax);
        System.out.println("Минимальная сумма строки "+ sumLineMin);
        System.out.println("Номер строки с минимальной суммой "+(numLineMinSum+1));
        System.out.println("Номер строки с максимальной суммой "+(numLineMaxSum+1));
    }
}
