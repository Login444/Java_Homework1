package org.example;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /**
         * Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();

        System.out.println("Sum = " + sumNumbers(n));

        System.out.println("Product = " + prodNumbers(n));
        scanner.close();
    }

    /**
     * @apiNote
     * @param n
     * @return prod
     */
    private static int prodNumbers(int n) {
        int prod = 1;
        if (n==0) return n;
        while (n != 0) {
            prod = prod * n;
            n--;
        }
        return prod;

    }

    /**
     * @apiNote
     * @param n
     * @return sum
     */
    private static int sumNumbers(int n) {
        int sum = 0;

        if (n==0) return n;

        while (n != 0) {
            sum = sum + n;
            n--;
        }
        return sum;
    }
}
