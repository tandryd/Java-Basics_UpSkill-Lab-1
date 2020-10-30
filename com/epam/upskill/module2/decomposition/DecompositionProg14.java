/*Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенных в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.*/
package com.epam.upskill.module2.decomposition;
import java.util.Scanner;
public class DecompositionProg14 {
    public static void main(String[] args) {
        int endOfSegment = getIntegerfromConsole();
        printArmstrongNambersOnSement(endOfSegment);
    }
    private static int getIntegerfromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the segment end (k): ");
        int k = scanner.nextInt();
        while (k <= 1) {
            System.out.println("Enter a positive integer greater than 1 (greater than 1000 is better)");
            k = scanner.nextInt();
        }
        return k;
    }
    private static void printArmstrongNambersOnSement(int k) {
        for (int i = 1; i <= k; i++) {
            if (sumOfDigitsInPower(i)==i){
                System.out.print(i +" ");
            }
        }
    }
    private static int getNumOfDigits(int number){
        int count=0;
        while(number>0){
            count++;
            number/=10;
        }
        return count;
    }
    private static int sumOfDigitsInPower(int number) {
        int numOfDigits = getNumOfDigits(number);
        int sum = 0;
        while (number > 0) {
            sum += Math.pow(number % 10, numOfDigits);
            number /= 10;
        }
        return sum;
    }
}
