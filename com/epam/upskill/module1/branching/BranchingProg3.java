package com.epam.upskill.module1.branching;

import java.util.Scanner;

public class BranchingProg3 {
    public static void main(String[] args) {

        System.out.print("Введите координату x точки 1. x1 = ");
        Scanner scan = new Scanner(System.in);
        int xOfpoint1 = scan.nextInt();

        System.out.print("Введите координату y точки 1. y1 = ");
        int yOfpoint1 = scan.nextInt();

        System.out.print("Введите координату x точки 2. x2 = ");
        int xOfpoint2 = scan.nextInt();

        System.out.print("Введите координату y точки 2. y2 = ");
        int yOfpoint2 = scan.nextInt();

        System.out.print("Введите координату x точки 3. x3 = ");
        int xOfpoint3 = scan.nextInt();

        System.out.print("Введите координату y точки 3. y1 = \" ");
        int yOfpoint3 = scan.nextInt();

        if ((xOfpoint3 - xOfpoint1) / (xOfpoint2 - xOfpoint1) == (yOfpoint3 - yOfpoint1) / (yOfpoint2 - yOfpoint1)) {
            System.out.println("Точки с заданными координатами лежат на одной прямой");
        }

        else System.out.println("Точки с заданными координатами не лежат на одной прямой");

    }
}
