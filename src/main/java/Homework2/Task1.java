package Homework2;

import java.util.Scanner;

public class Task1 {
    //Дана последовательность N целых чисел. Найти сумму простых чисел
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длинну последовательности: ");
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            if (num > 1) {
                if (naturalNumber(num) != false){
                    sum += num;
                }
            }
        }
        scan.close();
        System.out.println("sum = " + sum);

    }

    /**
     * @apiNote проверка простое ли число
     * @param n
     * @return true or false
     */
    private static boolean naturalNumber(int n) {
        boolean a = false;
        int count = 0;
        for (int j = 1; j <= n; j++) {
            if (n > 2 && n % 2 == 0) break;
            if (n % j == 0) {
                count++;
            }
        }
        if (count > 3) a = false;
        if (count == 2) a = true;
        return a;
    }
}
