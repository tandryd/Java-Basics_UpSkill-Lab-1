/*Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел: */
package com.epam.upskill.module2.decomposition;
import java.util.Scanner;

public class DecompositionProg1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int naturalA = getNaturalNumber(scanner);
    int naturalB = getNaturalNumber(scanner);
    int nod = greatestCommonDivisor(naturalA, naturalB);
    System.out.println("NOD: " + nod);
    int nok = calculateLeastCommonMultiple(naturalA, naturalB);
    System.out.println("NOK: " + nok);
    scanner.close();
    }

    private static int greatestCommonDivisor(int a, int b) {
        if (a<=0 || b<=0) throw new UnsupportedOperationException("Incorrect input");
        while(a!=0 && b!=0){
            if (a>b) {
                a = a % b;
            }
            else b=b%a;
        }
        return a+b;
    }
    private static int calculateLeastCommonMultiple(int a, int b) {
        return a / greatestCommonDivisor(a,b) * b;
    }

    private static int getNaturalNumber (Scanner scanner)  {
        int natural;
        do {
            System.out.println("Enter a natural number");
            while (!scanner.hasNextInt()) {
                System.out.println("Incorrect input! Enter natural number!");
                scanner.next();
            }
            natural = scanner.nextInt();
        }
        while (natural <= 0);
        System.out.println("Thank you! Got " + natural);
        return natural;
    }
}

