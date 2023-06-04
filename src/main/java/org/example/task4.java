package org.example;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = 0;
        int w = 0;
        int e = 0;
        char find;
        System.out.println("Уравнение: q + w = e");
        System.out.println("Условие: q, w, e >= 0");

        System.out.println("Какую переменную будем искать?");
        find = scanner.next().charAt(0);

        switch (find){
            case 'q':
                System.out.println("Введите остальные переменные: ");
                w = scanner.nextInt();
                e = scanner.nextInt();
                if (w < 0 || e < 0){
                    System.out.println("Числа не могут быть отрицательными");
                    return;
                }
                if (e == 0 && w != 0){
                    System.out.println("Неверное выражение, решения нет");
                    return;
                }
                if (e < w){
                    System.out.println("Сумма не может быть меньше одного из слагаемых");
                    return;
                }
                q = e - w;
                break;
            case 'w':
                System.out.println("Введите остальные переменные: ");
                q = scanner.nextInt();
                e = scanner.nextInt();
                if (q < 0 || e < 0){
                    System.out.println("Числа не могут быть отрицательными");
                    return;
                }

                if (e == 0 && q != 0){
                    System.out.println("Неверное выражение, решения нет");
                    return;
                }
                if (e < q){
                    System.out.println("Сумма не может быть меньше одного из слагаемых");
                    return;
                }
                w = e - q;
                break;
            case 'e':
                System.out.println("Введите остальные переменные: ");
                q = scanner.nextInt();
                w = scanner.nextInt();
                if (q<0 || w<0){
                    System.out.println("Числа не могут быть отрицательными");
                    return;
                }
                e = q + w;
                break;
        }
        System.out.printf(q + " + " + w + " = " + e);
    }
}
