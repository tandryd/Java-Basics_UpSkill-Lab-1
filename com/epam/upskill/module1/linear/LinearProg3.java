package com.epam.upskill.module1.linear;

import java.util.Scanner;
import static java.lang.Math.*;

public class LinearProg3 {
    public static void main(String[] args) {

        System.out.print("Введите значение x: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        System.out.print("Введите значение y: ");
        double y = scanner.nextDouble();

        double result = (((sin(x) + cos(y)) / cos(x)) - sin(y)) * tan(x * y);
        System.out.println("результат = " + result);

    }
}
