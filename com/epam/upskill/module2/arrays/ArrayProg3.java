package com.epam.upskill.module2.arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayProg3 {
    public static void main(String[] args) {
        int sumNegative = 0;
        int sumPositive = 0;
        int sumZero = 0;
        Scanner scanner = new Scanner(System.in);
        int myArrayLength = ArrayUtils.getArrayLengthFromKeyboard(scanner);
        double [] myArray = ArrayUtils.getArrayDoubleFromKeyboard(myArrayLength);
        System.out.println(Arrays.toString(myArray));
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] >0){
                sumPositive =++sumPositive;
            }
                else {
                    if (myArray[i] != 0) {
                        sumNegative = ++sumNegative;
                    }   else {
                        sumZero = ++sumZero;
                        }
                }
        }
        System.out.println("Number of positive numbers in the array = " + sumPositive);
        System.out.println("Number of negative numbers in the array = " + sumNegative);
        System.out.println("Number of nulls in the array =  " + sumZero);

    }
}
