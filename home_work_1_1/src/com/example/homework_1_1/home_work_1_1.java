package com.example.homework_1_1;

/**
 * Created by v.krizhanovskiy on 19.02.2015.
 */
public class home_work_1_1 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");

        if(sc.hasNextInt()) {
            n = sc.nextInt();

            int[] anArray;
            anArray = new int[n];

            //заполнение массива
            for(int i = 0; i < n; i++){
                System.out.print("Введите " + i + "-ый элемент: ");
                anArray[i] = sc.nextInt();
            }

            // сортировка массива
            for(int i = 0; i < n - 1; i++){
                for(int j = 0; j < n - i -1; j++){
                    if(anArray[j] > anArray[j + 1]){
                        int a = anArray[j];
                        anArray[j] = anArray[j+1];
                        anArray[j+1] = a;
                    }
                }
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
