/*Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника. */
package com.epam.upskill.module2.decomposition;
import java.util.Scanner;
public class DecompositionProg3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of hexagon side: ");
        double sideA = scanner.nextDouble();
        double hexagonSquare = 6*getTriangleSquare(sideA);
        System.out.printf("Hexagon square = %.3f", hexagonSquare);
    }
    private static double getTriangleSquare(double sideA) {
        double triangleSquare = Math.pow(sideA, 2)/4 * Math.sqrt(3);
        return triangleSquare;
    }
}
