/*Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789).
 Для решения задачи использовать декомпозициюю.*/
package com.epam.upskill.module2.decomposition;
import java.lang.*;
public class DecompositionProg15 {
    public static void main(String[] args) {
        int n = 5;
        int startNum = (int) Math.pow(10, n - 1);
        int endNum = (int) Math.pow(10, n) - 1;
        for (int i = startNum; i <= endNum; i++) {
            int []myArray = getArrayOfDigits(i,n);
            if (checksArrayOfDigits(myArray)) {
                System.out.print(i + " ");
            }
        }
    }
    public static int[] getArrayOfDigits(int number, int n) {
        int[] tempArray = new int[n];
        int tempNum;
        for (int i = 0; i < n; i++) {
            tempNum = number % 10;
            tempArray[i] = tempNum;
            number /= 10;
        }
        return tempArray;
    }
    private static boolean checksArrayOfDigits(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] - arr[i + 1] == 1) {
                count++;
            }
        }
        if (count == arr.length - 1) {
            return true;
        }
        return false;
    }
}






