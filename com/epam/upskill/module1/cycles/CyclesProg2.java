package com.epam.upskill.module1.cycles;

import java.util.InputMismatchException;
import java.util.Scanner;
public class CyclesProg2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double x, a, b, period_h, function_F;
        while (true) {
            try {
                System.out.print("Введите значение начала отрезка a: ");
                a = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.print("Некорректные данные. Попробуйте еще раз. ");
                continue;
            } break;
        }
        while (true) {
            try {
                System.out.print("Введите значение конца отрезка b: ");
                b = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.print("Некорректные данные. Попробуйте еще раз. ");
                continue;
            }
            break;
        }
        while (true) {
            try {
                System.out.print("Введите шаг h: ");
                period_h = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.print("Некорректные данные. Попробуйте еще раз. ");
                continue;
            }
            break;
        }

        for (x = a; x <= b; x += period_h) {
            if (x > 2)
                function_F = x;
            else function_F = -x;
                if (x == 0)
                function_F = 0;
                System.out.print(function_F + " ");
        }
    }
}