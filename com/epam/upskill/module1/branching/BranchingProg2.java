package com.epam.upskill.module1.branching;

import java.util.Scanner;

public class BranchingProg2 {
    public static void main(String[] args) {
        double minAB, minBC, maxResult;

        System.out.print("Введите значениие a: ");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();

        System.out.print("Введите значениие b: ");
        double b = scan.nextDouble();

        System.out.print("Введите значениие c: ");
        double c = scan.nextDouble();

        System.out.print("Введите значениие d: ");
        double d = scan.nextDouble();

        if (a>b)
            minAB=b;
            else minAB=a;
        if (c>d)
            minBC=d;
            else minBC=c;

        if (minAB > minBC)
            maxResult = minAB;
        else maxResult = minBC;
        System.out.print("значение max = " + maxResult);

    }
}
