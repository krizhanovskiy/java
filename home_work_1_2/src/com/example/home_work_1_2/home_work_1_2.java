package com.example.home_work_1_2;

import java.util.Scanner;

/**
 * Created by v.krizhanovskiy on 19.02.2015.
 */

import java.util.Scanner;
public class home_work_1_2 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число Фибоначчи: ");

        //Проверка является ли введенное число целым
        if(sc.hasNextInt()) {
            n = sc.nextInt();

            int[] anArray;
            anArray = new int[n];

            //инициализация первых элементов массива
            anArray[0] = 0;
            anArray[1] = 1;

            //заполнение массива
            for(int i = 2; i < n; i++){
                anArray[i] = anArray[i-1] + anArray[i-2];
            }

            //распечатка значения
            System.out.print(" " + anArray[n-1]);

        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
