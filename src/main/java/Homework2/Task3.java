package Homework2;

import java.util.Scanner;

public class Task3 {
    //Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
    public static void main(String[] args) {
        int[] n = newArray();
        showArray(n);
        int sumIndex = 0;
        for (int i = 0; i < n.length; i++) {
            if (100 > n[i] && n[i] >= 10){
                sumIndex += i;
            }
            if (-100 < n[i] && -10 >= n[i]){
                sumIndex += i;
            }
        }
        System.out.println("\n sumIndex = " + sumIndex);

        for (int i = 0; i < n.length; i++) {
            if (n[i] < 0){
                n[i] = sumIndex;
            }
        }

        showArray(n);
        }

    private static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }




    private static int[] newArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + "-й элемент: ");
            arr[i] = scan.nextInt();
        }
        return arr;
    }
}
