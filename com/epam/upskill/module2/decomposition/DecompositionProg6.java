/*Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми. */
package com.epam.upskill.module2.decomposition;
import java.util.Scanner;

import static com.epam.upskill.module2.decomposition.DecompositionUtils.*;

public class DecompositionProg6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = getNaturalFromKeyboard(scanner);
        int b = getNaturalFromKeyboard(scanner);
        int c = getNaturalFromKeyboard(scanner);
        findCoprimeNumbers(a, b, c);
        scanner.close();
    }
    private static void findCoprimeNumbers(int a, int b, int c) {
        if (calculateGreatestCommonDivisor(a, b) ==1 && calculateGreatestCommonDivisor(a, c) ==1 && calculateGreatestCommonDivisor(b, c) ==1 ) {
            System.out.println("These are coprime numbers");
        }
        else
            System.out.println("These are not coprime numbers");
    }
}
