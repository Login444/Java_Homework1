package org.example;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        naturalNumbers(n);
    }

    private static void naturalNumbers(int n) {
        if (n<=1) System.out.println("Null");
        for (int i = 2; i <= n ; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i > 2 && i % 2 == 0) break;
                if (i%j == 0){
                    count++;
                }
                if (count > 3) break;
            }
            if (count == 2) System.out.println(i);
        }
    }
}
