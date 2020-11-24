package com.epam.upskill.module2.arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayProg5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myArrayLength = ArrayUtils.getArrayLengthFromKeyboard(scanner);
        int [] myArray = ArrayUtils.getArrayIntFromKeyboard(myArrayLength);
        System.out.println(Arrays.toString(myArray));
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > i ){
                System.out.print(myArray[i] + " ");
            }
        }
    }
}
