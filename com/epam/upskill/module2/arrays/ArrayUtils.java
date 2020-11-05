package com.epam.upskill.module2.arrays;
import java.math.BigDecimal;
import java.util.Scanner;
import java.math.RoundingMode;
class ArrayUtils {

     static int getArrayLengthFromKeyboard(Scanner scanner) {
        int myArrayLength;
        while (true) {
            try {
                System.out.print("Enter the length of the array: ");
                myArrayLength = Integer.parseInt(scanner.nextLine());
                if (myArrayLength < 0) {
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

    static int[] getArrayNaturalFromKeyboard (Scanner scanner,int arrayLength){
        int[] myArrayNatural = new int [arrayLength];
        int i = 0;
        while (i < myArrayNatural.length) {

            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (value>0) {
                    myArrayNatural[i] = value;
                    i++;
                } else{
                    System.out.println("Number must be positive");
                }
            } else {
                System.out.println("It's not a Natural. Try again");
                scanner.next();
            }
        }
        return myArrayNatural;
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
        int i = 0;
        while (i < myArrayInt.length) {
            if (scanner.hasNextInt()) {
                myArrayInt [i] = scanner.nextInt();
                i++;
            } else {
                System.out.println("It's not a Integer. Try again");
                scanner.next();
            }
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
