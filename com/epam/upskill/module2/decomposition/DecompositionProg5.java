/*Составить программу, которая в массиве A[N] находит второе по величине число
(вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов). */
package com.epam.upskill.module2.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class DecompositionProg5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the length of the array. ");
        int myArrayLength = getNaturalFromKeyboard(scanner);
        int[] myArray = new int [myArrayLength];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(myArray));
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
        System.out.println("the number we are looking for: " + myArray[myArray.length-2]);
        scanner.close();
    }

    static int getNaturalFromKeyboard(Scanner scanner) {
        int natural;
        while (true) {
            try {
                System.out.print("Please, enter a natural number: ");
                natural = Integer.parseInt(scanner.nextLine());
                if (natural < 0) {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Incorrect input. ");
                continue;
            }
            break;
        }
        return natural;
    }
}
