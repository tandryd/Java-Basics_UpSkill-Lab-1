/* Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.*/
package com.epam.upskill.module2.decomposition;

import java.util.Scanner;

public class DecompositionProg16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = getNaturalNumber(scanner);
        int sum = getSum(n);
        System.out.println("Sum we are looking for = " + sum);
        System.out.println("Number of even in the sum = " + countEven(sum));
        scanner.close();
    }

    static int getNaturalNumber (Scanner scanner)  {
        int natural;
        do {
            System.out.println("Enter a natural number from 1 to 9");
            while (!scanner.hasNextInt()) {
                System.out.println("Incorrect input! Enter natural number from 1 to 9!");
                scanner.next();
            }
            natural = scanner.nextInt();
        }
        while (natural <= 0 || natural>=10);
        System.out.println("Thank you! Got " + natural);
        return natural;
    }

    private static int getSum(int n) {
        int sum = 0;
        int startNum = (int) Math.pow(10, n - 1);
        int endNum = (int) Math.pow(10, n) - 1;
        for (int i = startNum; i <= endNum; i++) {
            if (checksArrayOfDigits(getSequenceOfDigits(i, n))){
            sum  += i;
            }
        }
        return sum;
    }

    public static int[] getSequenceOfDigits(int number, int size) {
        int[] tempArray = new int[size];
        int tempNum;
        for (int i = 0; i < size; i++) {
            tempNum = number % 10;
            tempArray[i] = tempNum;
            number /= 10;
        }
        return tempArray;
    }

    private static boolean checksArrayOfDigits(int[] arr) {
        for (int j : arr) {
            if (j % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    private static int countEven  (int number){
        int temp;
        int count = 0;
        while (number != 0) {
            temp = number % 10;
            if (temp%2 == 0) {
                count++;
            }
            number /= 10;
        }
        return count;
    }

}
