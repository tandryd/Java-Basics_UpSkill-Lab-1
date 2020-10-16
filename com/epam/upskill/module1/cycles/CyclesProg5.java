package com.epam.upskill.module1.cycles;

import static java.lang.Math.*;
import java.util.Scanner;
public class CyclesProg5 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double summa = 0;
        System.out.print("Введите число n:");
        int number = scanner.nextInt();
        System.out.print("Введите число e:");
        double e = scanner.nextDouble();
        for (int i = 1; i <= number; i++) {
            double a = (1 / pow(2, i) + 1 / pow(3, i));
             System.out.println(a);
            if (abs(a) >= e)
                summa = summa + a;
        }
        System.out.println("Сумма а = " + summa);
    }
}