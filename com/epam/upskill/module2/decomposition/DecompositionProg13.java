/*Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
Для решения задачи использовать декомпозицию.*/
package com.epam.upskill.module2.decomposition;
import static com.epam.upskill.module2.decomposition.DecompositionUtils.*;
import java.util.Scanner;
public class DecompositionProg13 {
    public static void main(String[] args) {
        int n = getIntegerFromConsole();
        printTwinNumber(n);
    }
    private static void printTwinNumber(int n) {
        System.out.println("Twin numbers on a given segment:");
        for (int i = n; i <= 2 * n - 2; i++) {
            if (calculateGreatestCommonDivisor(i, i + 2) == 1) {
                System.out.println(i + " - " + (i + 2));
            }
        }
    }
    private static int getIntegerFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the segment start: ");
        int n = scanner.nextInt();
        while (n <= 2) {
            System.out.println("Enter a positive integer greater than 2!");
            n = scanner.nextInt();
        }
        return n;
    }
}