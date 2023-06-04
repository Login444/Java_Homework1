package org.example;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu() {
        while (true){
            System.out.println("1.+\n" +
                    "2.-\n" +
                    "3.*\n" +
                    "4./\n" +
                    "5.**\n" +
                    "6.Exit\n");
            Scanner choose = new Scanner(System.in);
            int n = choose.nextInt();
            switch (n){
                case 1:
                    System.out.println("summa = " + summa());
                    break;
                case 2:
                    System.out.println("minus = " + minus());
                    break;
                case 3:
                    System.out.println("product = " + product());
                    break;
                case 4:
                    System.out.println("division = " + division());
                    break;
                case 5:
                    System.out.println("degree = " + degree());
                    break;
                case 6:
                    quit();
                default:
                    System.out.println("Try again!");
                    break;
            }
        }
    }

    private static boolean quit() {
        return false;
    }

    private static double degree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        double a = scanner.nextDouble();
        System.out.println("Введите степень в которую возводим: ");
        double b = scanner.nextDouble();
        double deg = 1;
        for (int i = 1; i <= b ; i++) {
            deg = deg * a;
        }
        scanner.close();
        return deg;
    }

    private static double division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double b = scanner.nextDouble();
        double div = a / b;
        scanner.close();
        return div;
    }

    private static double product() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double b = scanner.nextDouble();
        double product = a - b;
        scanner.close();
        return product;
    }

    private static double minus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double b = scanner.nextDouble();
        double minus = a - b;
        scanner.close();
        return minus;
    }

    private static double summa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double b = scanner.nextDouble();
        double sum = a+b;
        scanner.close();
        return sum;
    }
}
