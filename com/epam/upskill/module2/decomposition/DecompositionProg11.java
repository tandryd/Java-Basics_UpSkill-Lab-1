/*Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.*/
package com.epam.upskill.module2.decomposition;
public class DecompositionProg11 {
    public static void main(String[] args) {
        int firstNumber = 4000;
        int secondNumber = 500;
        compareCountsOfDigits(firstNumber, secondNumber);
    }
    private static void compareCountsOfDigits (int number1, int number2) {
        int count1 = getCount(number1);
        int count2 = getCount(number2);
        if (count1 > count2) {
            System.out.println("First number longer");
        } else if (count1 != count2) {
            System.out.println("Second number longer");
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

