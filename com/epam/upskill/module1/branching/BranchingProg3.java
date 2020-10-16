package com.epam.upskill.module1.branching;

import java.util.Scanner;

public class BranchingProg3 {
    public static void main(String[] args) {

        System.out.print("Введите координату x точки 1. x1 = ");
        Scanner scan = new Scanner(System.in);
        int point1_x = scan.nextInt();

        System.out.print("Введите координату y точки 1. y1 = ");
        int point1_y = scan.nextInt();

        System.out.print("Введите координату x точки 2. x2 = ");
        int point2_x = scan.nextInt();

        System.out.print("Введите координату y точки 2. y2 = ");
        int point2_y = scan.nextInt();

        System.out.print("Введите координату x точки 3. x3 = ");
        int point3_x = scan.nextInt();

        System.out.print("Введите координату y точки 3. y1 = \" ");
        int point3_y = scan.nextInt();

        if ((point3_x - point1_x) / (point2_x - point1_x) == (point3_y - point1_y) / (point2_y - point1_y))
            System.out.println("Точки с заданными координатами лежат на одной прямой");

        else System.out.println("Точки с заданными координатами не лежат на одной прямой");

    }
}
