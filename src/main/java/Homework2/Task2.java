package Homework2;

import java.util.Scanner;

public class Task2 {
    // Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длинну последовательности: ");
        int n = scan.nextInt();
        secuenceEval(n);
        scan.close();
    }

    /**
     * @apiNote оценка послеовательности
     * @param n - длинна последовательности
     */
    private static void secuenceEval(int n) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 1-е число: ");
        int first = scan.nextInt();
        int count = 0;
        for (int i = 1; i < n ; i++) {
            System.out.println("Введите " + (i+1) + "-е число: ");
            int second = scan.nextInt();
            if (second > first){
                count +=1;
            }
        }
        scan.close();
        if (count == n-1){
            System.out.println("Последовательность возрастающая.");
        }
        else {
            System.out.println("Последовательность не возрастающая.");
        }
    }
}