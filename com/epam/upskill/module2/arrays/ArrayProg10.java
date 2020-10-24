package com.epam.upskill.module2.arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayProg10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myArrayLenght = ArrayUtils.getMyArrayLength(scanner);
        int[] myArray = ArrayUtils.getArrayIntFromKeyboard(myArrayLenght);
        System.out.println(Arrays.toString(myArray));
        for (int i =0; i < myArray.length; i++) {
            if ((i+1)%2 ==0){
                myArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
