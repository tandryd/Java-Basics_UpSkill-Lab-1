package com.epam.upskill.module2.arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayProg4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myArrayLength = ArrayUtils.getMyArrayLength(scanner);
        double [] myArray = ArrayUtils.getArrayDoubleFromKeyboard(myArrayLength);
        System.out.println(Arrays.toString(myArray));
        ArrayUtils.replaceMaxWithMin(myArray);
        System.out.println(Arrays.toString(myArray));
    }



}

