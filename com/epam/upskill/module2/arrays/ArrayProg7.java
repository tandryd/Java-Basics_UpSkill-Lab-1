package com.epam.upskill.module2.arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayProg7 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int n = ArrayUtils.getArrayLengthFromKeyboard(scanner);
        int myArrayDoubledLenght = n * 2;
        int[] myArray = ArrayUtils.getArrayIntFromKeyboard(myArrayDoubledLenght);
        System.out.println(Arrays.toString(myArray));
        int[] newArray = new int[n];
        for (int i = 0, j = myArray.length - 1; i < n & j >= n; i++, j--) {
            sum = myArray[i] + myArray[j];
            for (int k = i; k < newArray.length; k++) {
                newArray[k] = sum;
            }
        }
        System.out.println(Arrays.toString(newArray));
        int max = ArrayUtils.findMaxInArray(newArray);
        System.out.println("Maximum = " + max);
    }
}



