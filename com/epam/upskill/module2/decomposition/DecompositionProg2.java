/*Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел. */
package com.epam.upskill.module2.decomposition;
import java.util.Arrays;
import java.util.Scanner;
public class DecompositionProg2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[4];
        System.out.println("Insert array elements:");
        fillArrayWithNaturalNumbers(scanner, myArray);
        System.out.println(Arrays.toString(myArray));
        System.out.println("Greatest common divisor: " + getGreatestCommonDivisorFromArray(myArray));
        scanner.close();
    }

    private static void fillArrayWithNaturalNumbers(Scanner scanner, int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            if (scanner.hasNextInt()) {
                int temp = scanner.nextInt();
                if (temp > 0) {
                    myArray[i] = temp;
                } else {
                    System.out.println("Please, enter positive number");
                    i--;
                }
            } else {
                System.out.println("Incorrect input. Please, enter positive number ");
                i--;
                scanner.next();
            }
        }
    }

    private static int getGreatestCommonDivisorFromArray(int[] myArray) {
        for (int i = 0; i < myArray.length-1 ; i++) {
            int gcd = calculateGreatestCommonDivisor(myArray[i], myArray[i+1]);
                myArray[i+1] = gcd;
        }
        return myArray[myArray.length-1];
    }

    private static int calculateGreatestCommonDivisor(int a, int b){
            if (a <= 0 || b <= 0) throw new UnsupportedOperationException("Incorrect input");
            while (a != 0 && b != 0) {
                if (a > b) {
                    a = a % b;
                } else b = b % a;
            }
            return a + b;
        }
}


