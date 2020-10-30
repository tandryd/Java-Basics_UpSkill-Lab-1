/*Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
 если угол между сторонами длиной X и Y— прямой. */
package com.epam.upskill.module2.decomposition;
import static java.lang.Math.*;
public class DecompositionProg9 {
    public static void main(String[] args) {
        double x=3;
        double y=4;
        double z=5;
        double t=6;
        double hypotenuseOfTtriangle = sqrt(pow(x,2) + pow(y, 2));
        double quadrangleSquare = getRightTriangleSquare(x,y) + getTriangleSquare(z,t,hypotenuseOfTtriangle);
        System.out.println("Quadrangle square = " + quadrangleSquare);
    }
    private static double getTriangleSquare(double sideA, double sideB, double sideC) {
        double semiPerimeter = (sideA+sideB+sideC)/2;
        double triangleSquare = sqrt(semiPerimeter*(semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC));
        return triangleSquare;
    }
    private static double getRightTriangleSquare(double sideA, double sideB) {
        double RightTriangleSquare = sideA*sideB/2;
        return RightTriangleSquare;
    }

}