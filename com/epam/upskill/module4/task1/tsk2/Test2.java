/*
2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
Добавьте конструктор, инициализирующий члены класса по умолчанию.
Добавьте set- и get- методы для полей экземпляра класса.
 */
package com.epam.upskill.module4.task1.tsk2;

public class Test2 {
    private int a;
    private int b;

    public Test2 (int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Test2() {
        this.a = 1;
        this.b = 2;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
