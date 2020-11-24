/*Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9. */
package com.epam.upskill.module2.decomposition;
public class DecompositionProg7 {
    public static void main(String[] args) {
     long sum = getSumFactorialsOdd();
        System.out.println(sum);;
    }
    private static long getSumFactorialsOdd() {
        int firstNumber = 1;
        int lastNumber = 9;
        long sum = 0;
        int factorial = 1;
        for(int i = firstNumber; i <= lastNumber; i++){
            factorial *= i;
            if (i % 2 != 0) sum += factorial;
        }
        return sum;
    }
}
