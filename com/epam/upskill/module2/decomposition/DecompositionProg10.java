/*Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.*/
package com.epam.upskill.module2.decomposition;
import java.util.Arrays;
public class DecompositionProg10 {
    public static void main(String[] args) {
        int natural = 5;
        int [] myArray = new int[10];
        fillArray(natural, myArray);
        System.out.println(Arrays.toString(myArray));
    }
    private static void fillArray(int natural, int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = natural;
        }
    }
}
