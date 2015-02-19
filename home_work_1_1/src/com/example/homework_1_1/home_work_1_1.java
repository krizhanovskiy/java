package com.example.homework_1_1;

/**
 * Created by v.krizhanovskiy on 19.02.2015.
 */
import java.util.Scanner;

public class home_work_1_1 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");

        //Проверка является ли введенное число целым
        if(sc.hasNextInt()) {
            n = sc.nextInt();

            int[] anArray;
            anArray = new int[n];

            //заполнение массива
            for(int i = 0; i < n; i++){
                System.out.print("Введите " + i + "-ый элемент: ");
                anArray[i] = sc.nextInt();
            }

            int ifirst = 0;

            //сортировка массива
            for (int i = ifirst; i < anArray.length - 1; i++){

                int minj = ifirst;
                int min = anArray[minj];

                //поиск минимального элемента массива
                for (int j = ifirst; j < anArray.length - 1; j++){
                    if (min > anArray[j + 1]){
                        min = anArray[j+1];
                        minj = j+1;
                    }
                }

                //проверка условия нужно ли менять местами начальный элемент с найденным минимальным
                if (minj != ifirst){
                    int a = anArray[ifirst];
                    anArray[ifirst] = anArray[minj];
                    anArray[minj] = a;
                }
                ifirst++;
            }


            //распечатка массива
            for(int i = 0; i < n; i++){
                System.out.print(" " + anArray[i]);
            }

        } else {
            System.out.println("Вы ввели не целое число");
        }
    }

}
