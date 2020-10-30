/*Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел: */
package com.epam.upskill.module2.decomposition;
import java.util.Scanner;

public class DecompositionProg1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int naturalA = scanner.nextInt();
    int naturalB = scanner.nextInt();
    int nod = greatestCommonDivisor(naturalA, naturalB);
    System.out.println("NOD: " + nod);
    int nok = leastCommonMultiple(naturalA, naturalB);
    System.out.println("NOK: " + nok);

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
    private static int leastCommonMultiple(int a, int b) {
        return a / greatestCommonDivisor(a,b) * b;
    }
}

