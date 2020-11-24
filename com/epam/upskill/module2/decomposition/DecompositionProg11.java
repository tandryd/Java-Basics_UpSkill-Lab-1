/*Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.*/
package com.epam.upskill.module2.decomposition;
import java.util.Scanner;

import static com.epam.upskill.module2.decomposition.DecompositionUtils.*;
public class DecompositionProg11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNumber = getIntFromKeyboard(scanner);
        System.out.println("Enter the second number");
        int secondNumber = getIntFromKeyboard(scanner);
        compareCountsOfDigits(firstNumber, secondNumber);
        scanner.close();
    }
    private static void compareCountsOfDigits (int number1, int number2) {
        int count1 = getCount(number1);
        int count2 = getCount(number2);
        if (count1 > count2) {
            System.out.println("The first number is longer");
        } else if (count1 != count2) {
            System.out.println("The second number is longer");
        } else System.out.println("The same length of numbers");
    }
    private static int getCount(int number) {
        int count =0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}

