/*
7. Описать класс, представляющий треугольник.
Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.
 */
package com.epam.upskill.module4.task1.tsk7;

public class Triangle {
    private final Side A;
    private final Side B;
    private final Side C;

    public Triangle(Side a, Side b, Side c) {
        A = a;
        B = b;
        C = c;
    }

    public static Triangle createTriangle(Point a, Point b, Point c) {
        Side A = new Side(a, b);
        Side B = new Side(b, c);
        Side C = new Side(a, c);
        return new Triangle(A, B, C);
    }

    public double calculatePerimeter(){
        return A.calculateSide() + B.calculateSide() + C.calculateSide();
    }

    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - A.calculateSide()) * (p - B.calculateSide()) * (p - C.calculateSide()));
    }

    public Point pointMedianIntersection() {
        double x = (A.getA().getX() + A.getB().getX() + B.getB().getX()) / 3;
        double y = (A.getA().getY() + A.getB().getY() + B.getB().getY()) / 3;
        return new Point(x, y);
    }

}



