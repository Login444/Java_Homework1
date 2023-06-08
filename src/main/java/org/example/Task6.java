package org.example;

import java.util.Scanner;

public class Task6 {
    /**
     * Дана последовательность целых чисел, оканчивающаяся нулем.
     * Найти сумму положительных чисел, после которых следует отрицательное число
     */
    public static void main(String[] args) {
        System.out.println(sumOfPositive(array()));;
    }

    private static int sumOfPositive(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                sum = sum + array[i-1];
            }
        }
        return sum;
    }

    private static int[] array() {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                arr[i] = 0;
            }
            arr[i] = scan.nextInt();
        }
        scan.close();
        return arr;
    }
}
