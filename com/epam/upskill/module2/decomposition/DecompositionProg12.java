/*Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
элементами которого являются числа, сумма цифр которых равна К и которые не большее N. (при k=10,n=100 наглядно видно) */
package com.epam.upskill.module2.decomposition;
import java.util.Arrays;
import java.util.Scanner;
public class DecompositionProg12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter K:");
        int k = in.nextInt();
        System.out.println("Enter N:");
        int n = in.nextInt();
        int[] array = getArrayOfNumbers(k, n);
        System.out.println(Arrays.toString(array));
    }
    private static int[] getArrayOfNumbers(int k, int n) {
        int[] arrOfNum = new int[n];
        int index = 0;
        while (n-- > 0) {
            if (sumOfDigits(n) == k) {
                arrOfNum[index] = n;
                index++;
            }
        }
        int[] resultArray = new int[index];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = arrOfNum[i];
        }
        return resultArray;
    }
        private static int sumOfDigits ( int number){
            int sum = 0;
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            return sum;
        }
}
