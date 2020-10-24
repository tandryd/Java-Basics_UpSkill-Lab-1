package com.epam.upskill.module1.cycles;


import java.util.*;
public class CyclesProg8 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int number1, number2;
        System.out.print("Введите первое число: ");
        number1 = scanner.nextInt();
        List<Integer> array1 = getIntegers(number1);
        System.out.print("Введите второе число: ");
        number2 = scanner.nextInt();
        List<Integer> array2 = getIntegers(number2);
        array1.retainAll(array2);
        System.out.println("Cовпадают цифры: " + array1);
    }

    private static List<Integer> getIntegers(int number1) {
        List<Integer> array = new ArrayList<Integer>();
        do {
            array.add(number1 % 10);
            number1 /= 10;
        } while (number1 > 0);
        return array;
    }
}

