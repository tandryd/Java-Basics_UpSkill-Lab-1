package com.epam.upskill.module2.arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayProg1 {
    public static void main(String[] args) {
        int sum = 0;
        int dividerK = 2;
        int myArrayLength;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter the length of the array: ");
                myArrayLength = Integer.parseInt(scanner.nextLine());
                if (myArrayLength < 0) {
                throw new IllegalArgumentException();
                }
                    } catch (IllegalArgumentException e) {// не определяется NegativeArraySizeException
                System.out.println("Incorrect data. Please enter a natural number ");
                continue;
            }
            break;
        }
        int[] myArray = ArrayUtils.getArrayNatural(myArrayLength);
        System.out.println(Arrays.toString(myArray));

        for (int j : myArray) {
            if (j % dividerK == 0) {
                sum += j;
            }
        }
        System.out.println("Sum of multiples of " + dividerK + " = " + sum);
    }
}