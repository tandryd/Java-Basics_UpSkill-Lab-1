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

    private static Triangle createTriangle(Point a, Point b, Point c) {
        Side A = new Side(a, b);
        Side B = new Side(b, c);
        Side C = new Side(a, c);
        return new Triangle(A, B, C);
    }

    private double calculatePerimeter(){
        return A.calculateSide() + B.calculateSide() + C.calculateSide();
    }

    private double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - A.calculateSide()) * (p - B.calculateSide()) * (p - C.calculateSide()));
    }

    private Point pointMedianIntersection() {
        double x = (A.getA().getX() + A.getB().getX() + B.getB().getX()) / 3;
        double y = (A.getA().getY() + A.getB().getY() + B.getB().getY()) / 3;
        return new Point(x, y);
    }

    public static void main(String[] args) {
        Point a = new Point(0,-6);
        Point b = new Point(4,9);
        Point c = new Point(5,3);
        System.out.printf("the triangle vertices are set: point a (%.1f,%.1f); point b (%.1f,%.1f); point c (%.1f,%.1f).%n",
                a.getX(), a.getY(), b.getX(), b.getY(), c.getX(), c.getY());

        Triangle triangle = createTriangle(a, b, c);

        double perimeter = triangle.calculatePerimeter();
        System.out.printf("the perimeter of a triangle  = %f.%n", perimeter);

        double area = triangle.calculateArea();
        System.out.printf("the area of a triangle = %f.%n", area);

        Point intersection = triangle.pointMedianIntersection();
        System.out.printf("median intersection point: (%f,%f).", intersection.getX(), intersection.getY());
    }
}

class Point {
    private final double x;
    private final double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Side {
    private final Point a;
    private final Point b;

    Side (Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    double calculateSide() {
        return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
    }
}
