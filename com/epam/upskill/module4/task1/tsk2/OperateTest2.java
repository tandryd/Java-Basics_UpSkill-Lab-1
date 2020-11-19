/*
2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
Добавьте конструктор, инициализирующий члены класса по умолчанию.
Добавьте set- и get- методы для полей экземпляра класса.
 */
package com.epam.upskill.module4.task1.tsk2;

public class OperateTest2 {
    public static void main(String[] args) {
        Test2 one = new Test2(12, 4);
        Test2 two = new Test2();

        System.out.println("one A: " + one.getA());
        System.out.println("one B: " + one.getB());

        System.out.println("\nСмена переменных:");
        one.setA(20);
        one.setB(5);

        System.out.println("one A: " + one.getA());
        System.out.println("one B: " + one.getB());
        System.out.println();
        System.out.println("two A: " + two.getA());
        System.out.println("two B: " + two.getB());

        System.out.println("\nСмена переменных:");
        two.setA(21);
        two.setB(11);

        System.out.println("two A: " + two.getA());
        System.out.println("two B: " + two.getB());
    }
}
