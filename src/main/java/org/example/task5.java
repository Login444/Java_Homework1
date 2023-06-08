package org.example;

import java.util.Scanner;

public class task5 {
    /**
     * Учитывая входную строку s, измените порядок слов на противоположный .
     *
     * Слово определяется как последовательность не пробельных символов.
     * Слова в будут разделены хотя бы одним пробелом .s
     *
     * Возвращает строку слов в обратном порядке, объединенных одним пробелом.
     *
     * Обратите внимание , что sможет содержать начальные или конечные пробелы
     * или несколько пробелов между двумя словами. Возвращаемая строка должна
     * содержать только один пробел, разделяющий слова.
     * Не включайте никаких дополнительных пробелов.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        Reverse(s);
    }

    private static void Reverse(String s) {
        String[] arr_s = s.split("\\s+");
        String temp = "";
        for (int i = arr_s.length; i > 0; i--) {
            temp = temp + arr_s[i-1] +" ";
        }
        System.out.println(temp.trim());
    }
}
