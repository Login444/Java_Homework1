package org.example;

import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        double a;
        double b;
        double c = 0;
        char operation;
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите 1-е число: ");
        a = enter.nextDouble();
        System.out.println("Введите 2-е число: ");
        b = enter.nextDouble();
        System.out.println("Введите операцию (+, -, *, /): ");
        operation = enter.next().charAt(0);
        switch (operation){
            case '+':
                c = a + b;
                break;
            case '-':
                c = a - b;
                break;
            case '*':
                c = a * b;
                break;
            case '/':
                c = a / b;
                break;
            default:
                System.out.println("Неверная операция!");
                return;
        }
        System.out.printf(a + " " + operation + " " + b + " = " + c);
    }
}
