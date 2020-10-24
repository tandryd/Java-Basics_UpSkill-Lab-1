package com.epam.upskill.module2.arrays;
import java.math.BigDecimal;
import java.util.Scanner;
import java.math.RoundingMode;

class ArrayUtils {

     static int getMyArrayLength(Scanner scanner) {
        int myArrayLength;
        while (true) {
            try {
                System.out.print("Enter the length of the array: ");
                myArrayLength = Integer.parseInt(scanner.nextLine());
                if (myArrayLength < 0) {
                    throw new IllegalArgumentException();
                }
            } catch (NegativeArraySizeException | NumberFormatException e) {
                System.out.println("Incorrect data. Please enter a natural number ");
                continue;
            }
            break;
        }
        return myArrayLength;
    }

    static int[] getArrayNatural (int arrayLength){
        int[] myArray = new int [arrayLength];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (1 + Math.random() * myArray.length);
        }
        return myArray;
    }

    static double[] getArrayDouble (int arrayLength) {
        double [] myArrayDouble = new double [arrayLength];
               for (int i = 0; i < myArrayDouble.length; i++) {
                 double random = ((Math.random() * myArrayDouble.length) - myArrayDouble.length/2);
                 double shortDouble = new BigDecimal (random).setScale(5, RoundingMode.UP).doubleValue();
                 myArrayDouble [i] = shortDouble;
        }
        return myArrayDouble;
    }

    static double [] getArrayDoubleFromKeyboard(int arrayLength){
        Scanner scanner = new Scanner(System.in);
        double [] myArrayDouble = new double[arrayLength];
        System.out.println("Insert array elements:");
        for (int i = 0; i < myArrayDouble.length; i++) {
                   myArrayDouble [i] = scanner.nextDouble();
        }
        return myArrayDouble;
    }

    static int [] getArrayIntFromKeyboard (int arrayLength){
        Scanner scanner = new Scanner(System.in);
        int [] myArrayInt = new int[arrayLength];
        System.out.println("Insert array elements:");
        for (int i = 0; i < myArrayInt.length; i++) {
            myArrayInt [i] = scanner.nextInt();
        }
        return myArrayInt;
    }

    static void replaceMaxWithMin(double[] myArray ) {
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for (double mark : myArray) {
            min = Math.min(min, mark);
            max = Math.max(max, mark);
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == max) {
                myArray[i] = min;
            }
            else if (myArray [i] == min){
                myArray [i] = max;
            }
        }
    }
     static int findMaxInArray(int[] newArray) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] >= max) {
                max = newArray[i];
            }
        }
        return max;
    }
}
