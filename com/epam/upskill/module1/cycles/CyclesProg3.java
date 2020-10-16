package com.epam.upskill.module1.cycles;

import static java.lang.Math.pow;
public class CyclesProg3 {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum += pow(i, 2);
        }
        System.out.println("Сумма первых ста чисел = " + sum);
    }
}
