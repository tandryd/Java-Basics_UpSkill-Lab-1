package com.epam.upskill.module1.branching;

import java.util.Scanner;

public class BranchingProg1 {
    public static void main(String[] args) {
        System.out.println("Введите значениие угла х: ");
        Scanner scan = new Scanner(System.in);
        int angleX = scan.nextInt();

        System.out.println("Введите значениие угла angle_Y: ");
             int angleY = scan.nextInt();

        if (angleX + angleY < 180) {
            System.out.println("Треугольник с такими углами существует. ");
            if (angleX + angleY == 90) {
                System.out.print("Он прямоугольный.");
            }
            else System.out.print("Он не прямоугольный.");
        }
        else
            System.out.println("Треугольник с такими углами не cуществует. ");
    }
}
