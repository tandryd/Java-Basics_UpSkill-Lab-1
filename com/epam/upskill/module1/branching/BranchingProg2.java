package com.epam.upskill.module1.branching;

import java.util.Scanner;

public class BranchingProg2 {
    public static void main(String[] args) {

        System.out.print("Введите значениие a: ");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();

        System.out.print("Введите значениие b: ");
        double b = scan.nextDouble();

        System.out.print("Введите значениие c: ");
        double c = scan.nextDouble();

        System.out.print("Введите значениие d: ");
        double d = scan.nextDouble();

        MathUtilsForBranching minAandB = new MathUtilsForBranching();
        MathUtilsForBranching minCandD = new MathUtilsForBranching();
        MathUtilsForBranching maxOfTwoMin = new MathUtilsForBranching();

        System.out.print("значение max = " + maxOfTwoMin.findMax ((minAandB.findMin (a,b)), (minCandD.findMin(c,d))));

    }
}
