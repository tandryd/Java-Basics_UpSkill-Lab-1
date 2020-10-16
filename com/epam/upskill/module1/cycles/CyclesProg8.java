package com.epam.upskill.module1.cycles;


import java.util.*;
public class CyclesProg8 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int number1, number2;
        System.out.print("Введите первое число: ");
        number1 = scanner.nextInt();
        ArrayList<Integer> array1 = new ArrayList<Integer>();
            do {
                array1.add(number1 % 10);
                number1 /= 10;
            } while (number1 > 0);
        System.out.print("Введите второе число: ");
        number2 = scanner.nextInt();
        ArrayList<Integer> array2 = new ArrayList<Integer>();
            do {
                array2.add(number2 % 10);
                number2 /= 10;
            } while (number2 > 0);
        array1.retainAll(array2);
        System.out.println("Cовпадают цифры: " + array1);
    }
}

