package com.epam.upskill.module1.linear;

import java.util.Scanner;

public class LinearProg5 {
    public static void main(String[] args) {
        System.out.print("Введите значение секунд: ");
        Scanner scanner = new Scanner(System.in);
        int  timeInSecond = scanner.nextInt();

        int hours = timeInSecond / 3600;
        int minutes = (timeInSecond - hours*3600)/60; // (t/60)%60
        int seconds = timeInSecond - (hours * 3600) - (minutes * 60); // T%60
        System.out.println(timeInSecond + "c = " + hours + "ч " + minutes + "мин " + seconds + " сек");
    }
    }
