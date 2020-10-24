package com.epam.upskill.module1.linear;

import static java.lang.Math.*;
import java.util.Scanner;

public class LinearProg6 {
    public static void main(String[] args) {

        System.out.println("Введите значениие х: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.println("Введите значение y: ");
        int y = scanner.nextInt();

       Boolean z = (((y >= 0 && y <= 4 && abs(x) <= 2) || (y <= 0 && y >= -3 && abs(x) <= 4)) && (x != 0 || y != -1));

        System.out.println(z);


    }
}
