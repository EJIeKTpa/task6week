package ru.kk.evenodd.service;

import java.util.Scanner;

public class Number {
    public static void number() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int n = sc.nextInt();
        String result = (n % 2 == 0) ? "Чётное" : "Нечётное";
        System.out.println("Введённое число " + result);
        sc.close();
    }
}
