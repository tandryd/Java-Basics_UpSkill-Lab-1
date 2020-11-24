package com.epam.upskill.module2.arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayProg1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the divider: ");
        int divider = getNaturalFromConsole();
        System.out.print("Enter the length of array: ");
        int myArrayLength = getNaturalFromConsole();
        int[] myArray = ArrayUtils.getArrayNaturalFromKeyboard(scanner,myArrayLength);
        System.out.println(Arrays.toString(myArray));
        System.out.println("Sum of multiples of " + divider + " = " + getSum(sum, divider, myArray));
        scanner.close();
    }

    private static int getSum(int sum, int dividerK, int[] myArray) {
        for (int j : myArray) {
            if (j % dividerK == 0) {
                sum += j;
            }
        }
        return sum;
    }

    private static int getNaturalFromConsole() {
        int myArrayLength;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                myArrayLength = Integer.parseInt(scanner.nextLine());
                if (myArrayLength <= 0) {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Incorrect data. Please enter a natural number ");
                continue;
            }
            break;
        }
        return myArrayLength;
    }
}