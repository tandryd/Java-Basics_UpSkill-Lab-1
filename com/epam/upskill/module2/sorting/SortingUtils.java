package com.epam.upskill.module2.sorting;
import java.util.Scanner;
class SortingUtils {
    static int getMyArrayLength(Scanner scanner) {
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

    static int [] getArrayIntFromKeyboard (int arrayLength){
        Scanner scanner = new Scanner(System.in);
        int [] myArrayInt = new int[arrayLength];
        System.out.println("Insert array elements:");
        for (int i = 0; i < myArrayInt.length; i++) {
            if (scanner.hasNextInt()) {
                myArrayInt[i] = scanner.nextInt();
            }
                else {
                    System.out.println("Incorrect input. Please, enter a number");
                    i--;
                    scanner.next();
                }
        }
        return myArrayInt;
    }

    static int[] getArrayRandom (int arrayLength){
        int[] myArray = new int [arrayLength];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (1 + Math.random() * myArray.length);
        }
        return myArray;
    }
}
