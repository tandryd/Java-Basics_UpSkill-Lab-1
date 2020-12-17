package com.epam.upskill.module4.task1.tsk7;


public class Main {
    public static void main(String[] args) {
        Point pointA = new Point(0,-6);
        Point pointB  = new Point(4,9);
        Point pointC = new Point(5,3);
        System.out.printf("the triangle vertices are set: point a (%.1f,%.1f); point b (%.1f,%.1f); point c (%.1f,%.1f).%n",
                pointA.getX(), pointA.getY(), pointB .getX(), pointB .getY(), pointC.getX(), pointC.getY());


        Triangle triangle = Triangle.createTriangle(pointA, pointB, pointC);

        double perimeter = triangle.calculatePerimeter();
        System.out.printf("the perimeter of triangle  = %.2f \n", perimeter);

        double area = triangle.calculateArea();
        System.out.printf("the area of triangle = %.2f \n", area );

        Point intersection = triangle.pointMedianIntersection();
        System.out.printf("median intersection point: (%.1f,%.1f).", intersection.getX(), intersection.getY());
    }
}
