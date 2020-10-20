package com.epam.upskill.module2.arrays;

import java.util.Arrays;
import java.util.Random;

class ArrayUtils {
    static int[] getArrayNatural (int arrayLength){
        int[] myArray = new int [arrayLength];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (1 + Math.random() * myArray.length);
        }
        return myArray;
    }

    static double[] getArrayDouble (int arrayLength){
        Random rand = new Random();
        double [] myArrayDouble = new double [arrayLength];
        for (int i = 0; i < myArrayDouble.length; i++) {
//            myArrayDouble[i] = rand.nextDouble ()* arrayLength;
                 myArrayDouble[i] = ((Math.random() * myArrayDouble.length) - myArrayDouble.length/2);
        }
        return myArrayDouble;
    }

    static void printArrayInt (int[] myArray) {
        String myArrayString = Arrays.toString(myArray);
        System.out.println(myArrayString);
    }

    static void printArrayDouble (double[] myArray) {
        String myArrayString = Arrays.toString(myArray);
        System.out.println(myArrayString);
    }
}
