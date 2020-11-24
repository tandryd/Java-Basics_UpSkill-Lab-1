/*Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенных в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.*/
package com.epam.upskill.module2.decomposition;
import static com.epam.upskill.module2.decomposition.DecompositionUtils.*;
import java.util.Scanner;
public class DecompositionProg14 {
    public static void main(String[] args) {
<<<<<<< HEAD
        int endOfSegment = getIntegerFromConsole();
        printArmstrongNambersOnSement(endOfSegment);
    }
    private static int getIntegerFromConsole() {
=======
>>>>>>> cc005e0755c7068442527919e158e99222b91324
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the segment end (k): ");
        int endOfSegment =getIntFromKeyboard(scanner);
        printArmstrongNumbersOnSement(endOfSegment);
        scanner.close();
    }

    private static void printArmstrongNumbersOnSement(int k) {
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
