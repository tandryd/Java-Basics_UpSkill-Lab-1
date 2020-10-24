package com.epam.upskill.module1.linear;
import java.util.*;
public class LinearProg1 {

    public static void main(String[] args) {

        System.out.print("Введите значение a:");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        System.out.print("Введите значение b:");
        double b = scanner.nextDouble();

        System.out.print("Введите значение c:");
        double c = scanner.nextDouble();

        System.out.printf("значение  функции z = ( (a – 3 ) * b / 2) + c  = %.5f", MathUtils.linearProg1Util(a, b, c) );
    }
}
