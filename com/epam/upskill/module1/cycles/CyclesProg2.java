package com.epam.upskill.module1.cycles;

import java.util.InputMismatchException;
import java.util.Scanner;
public class CyclesProg2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double x;
        double startOfSegment;
        double endOfSegment;
        double periodH;
        double functionF;
        while (true) {
            try {
                System.out.print("Введите значение начала отрезка a: ");
                startOfSegment = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.print("Некорректные данные. Попробуйте еще раз. ");
                continue;
            } break;
        }
        while (true) {
            try {
                System.out.print("Введите значение конца отрезка b: ");
                endOfSegment = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.print("Некорректные данные. Попробуйте еще раз. ");
                continue;
            }
            break;
        }
        while (true) {
            try {
                System.out.print("Введите шаг h: ");
                periodH = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.print("Некорректные данные. Попробуйте еще раз. ");
                continue;
            }
            break;
        }

        for (x = startOfSegment; x <= endOfSegment; x += periodH) {
            if (x > 2)
                functionF = x;
            else functionF = -x;
                if (x == 0)
                functionF = 0;
                System.out.print(functionF + " ");
        }
    }
}