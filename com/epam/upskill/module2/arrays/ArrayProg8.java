package com.epam.upskill.module2.arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayProg8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myArrayLength = ArrayUtils.getMyArrayLength(scanner);
        int [] myArray = ArrayUtils.getArrayIntFromKeyboard(myArrayLength);
        System.out.println(Arrays.toString(myArray));
        int min = Integer.MAX_VALUE;
           for (int i = 0; i < myArray.length; i++) {
               if (myArray[i] <= min) {
               min = myArray[i];
               }
           }
        System.out.println("min = " + min);
        int numOfMins = 0;
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] == min){
                numOfMins++;
                }
            }
        System.out.println("numbers of mins = " + numOfMins);
        int [] newArray = new int [myArrayLength-numOfMins];
            for (int i = 0, j = 0; i < myArray.length; i++) {
                if (myArray[i] != min) {
                newArray[j] = myArray[i];
                j++;
                }
            }
        System.out.println(Arrays.toString(newArray));
    }
}

