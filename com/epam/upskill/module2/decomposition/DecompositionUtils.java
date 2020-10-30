package com.epam.upskill.module2.decomposition;

public class DecompositionUtils {
     static int greatestCommonDivisor(int a, int b) {
        if (a<=0 || b<=0) throw new UnsupportedOperationException("Incorrect input");
        while(a!=0 && b!=0){
            if (a>b) {
                a = a % b;
            }
            else b=b%a;
        }
        return a+b;
    }
}
