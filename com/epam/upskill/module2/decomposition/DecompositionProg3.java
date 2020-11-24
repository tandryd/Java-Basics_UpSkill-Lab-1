/*Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника. */
package com.epam.upskill.module2.decomposition;
import java.util.Scanner;
public class DecompositionProg3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of hexagon side: ");
        double sideA = getDoubleFromKeyboard(scanner);
        double hexagonSquare = 6*getTriangleSquare(sideA);
        System.out.printf("Hexagon square = %.3f", hexagonSquare);
        scanner.close();
    }
    private static double getTriangleSquare(double sideA) {
        double triangleSquare = Math.pow(sideA, 2)/4 * Math.sqrt(3);
        return triangleSquare;
    }

    private static double getDoubleFromKeyboard (Scanner scanner)  {
        double number;
        do {
            while (!scanner.hasNextDouble()) {
                System.out.println("Incorrect input! Enter double number!");
                scanner.next();
            }
            number = scanner.nextDouble();
        }
        while (number == 0);
        System.out.println("Thank you! Got " + number);
        return number;
    }

}
