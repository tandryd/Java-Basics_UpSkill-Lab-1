package com.epam.upskill.module2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProg2 {
    public static void main(String[] args) {
        int myArrayLength;
        int replacementsNumber = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter the length of the array: ");
                myArrayLength = Integer.parseInt(scanner.nextLine());
            } catch (NegativeArraySizeException | NumberFormatException e) {// не определяется NegativeArraySizeException
                System.out.println("Incorrect data. Please enter a natural number ");
                continue;
            }
            break;
        }
        double[] myArray = ArrayUtils.getArrayDouble(myArrayLength);
        System.out.println(Arrays.toString(myArray));
        System.out.print("Enter number Z: ");
        double z = scanner.nextDouble();

        for (int i = 0; i < myArrayLength; i++) {
            if (myArray[i] > z){
        myArray[i] = z;
        replacementsNumber =++replacementsNumber;
            }
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println("Number of replacement = " + replacementsNumber);

        }
}
