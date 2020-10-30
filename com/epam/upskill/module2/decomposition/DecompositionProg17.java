/*Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.*/
package com.epam.upskill.module2.decomposition;
public class DecompositionProg17 {
    public static void main(String[] args) {
    int number = 99;
        System.out.println("Number of substractions: " + subtractionSum(number));
    }
    private static int subtractionSum (int number){
        int count=0;
        while (number!=0){
            number = number-sumOfDigits(number);
            count++;
        }
        return count;
    }
    private static int sumOfDigits  (int number){
        int sum = 0;
        int temp;
        while (number!=0) {
            temp = number % 10;
            sum += temp;
            number /= 10;
        }
        return sum;
    }
}
