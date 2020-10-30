/*Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми. */
package com.epam.upskill.module2.decomposition;
import java.util.Scanner;

import static com.epam.upskill.module2.decomposition.DecompositionUtils.*;

public class DecompositionProg6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        findCoprimeNumbers(a, b, c);
    }
    private static void findCoprimeNumbers(int a, int b, int c) {
        if (greatestCommonDivisor(a, b) ==1 && greatestCommonDivisor(a, c) ==1 && greatestCommonDivisor(b, c) ==1 ) {
            System.out.println("These are coprime numbers");
        }
        else
            System.out.println("These are not coprime numbers");
    }
}
