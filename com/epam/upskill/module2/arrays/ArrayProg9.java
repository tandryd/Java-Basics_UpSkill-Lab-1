package com.epam.upskill.module2.arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayProg9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myArrayLenght = ArrayUtils.getArrayLengthFromKeyboard(scanner);
        int[] myArray = ArrayUtils.getArrayIntFromKeyboard(myArrayLenght);
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
        int count1;
        int pupular1;
        int count2 = 0;
        int popular2 = 0;
        for (int i = 0; i < myArray.length; i++) {
            pupular1 = myArray[i];
            count1 = 1;
            for (int j = i + 1; j < myArray.length; j++) {
                if (pupular1 == myArray[j]) count1++;
            }
            if (count1 > count2) {
                popular2 = pupular1;
                count2 = count1;
            } else if (count1 == count2) {
                popular2 = Math.min(popular2, pupular1);
            }
        }
        System.out.println("The smallest repeatable number is " + popular2);
    }
}
