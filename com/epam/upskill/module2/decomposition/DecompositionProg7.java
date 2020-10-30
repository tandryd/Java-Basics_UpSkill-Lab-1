/*Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9. */
package com.epam.upskill.module2.decomposition;
import java.util.Scanner;
public class DecompositionProg7 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int firstNumber = scanner.nextInt();
     int lastNumber = scanner.nextInt();
     long sum = getSumFactorialsOdd(firstNumber, lastNumber);
        System.out.println(sum);;
    }
    private static long getSumFactorialsOdd(int  firstNumber, int lastNumber) {
        long sum = 0;
        int factorial = 1;
        for(int i = firstNumber; i <= lastNumber; i++){
            factorial *= i;
            if (i % 2 != 0) sum += factorial;
        }
        return sum;
    }
}
