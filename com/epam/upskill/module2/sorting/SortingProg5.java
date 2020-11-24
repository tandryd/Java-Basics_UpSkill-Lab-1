/*Реализуйте сортировку Шелла. */
package com.epam.upskill.module2.sorting;
import java.util.Arrays;
import java.util.Scanner;
import static com.epam.upskill.module2.sorting.SortingUtils.getArrayRandom;
import static com.epam.upskill.module2.sorting.SortingUtils.getMyArrayLength;
public class SortingProg5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myArrayLength = getMyArrayLength(scanner);
        int[] myArray = getArrayRandom(myArrayLength);
        System.out.println(Arrays.toString(myArray));
        shellSortingUp(myArray);
        System.out.println(Arrays.toString(myArray));
        shellSortingDown(myArray);
        System.out.println(Arrays.toString(myArray));
    }
    private static void shellSortingUp(int[] array) {
        int h = 1;
        int n = array.length;
        while (h < n / 3)
            h = 3 * h + 1;
        while (h >= 1) {
            for (int i = h; i < array.length; i++) {
                for (int j = i; j >= h && array[j] < array[j - h]; j -= h) {
                    int temp = array[j];
                    array[j] = array[j - h];
                    array[j - h] = temp;
                }
            }
            h = h / 3;
        }
    }
    private static void shellSortingDown(int[] array) {
        int h = 1;
        int n = array.length;
        while (h < n / 3)
            h = 3 * h + 1;
        while (h >= 1) {
            for (int i = h; i < array.length; i++) {
                for (int j = i; j >= h && array[j] > array[j - h]; j -= h) {
                    int temp = array[j];
                    array[j] = array[j - h];
                    array[j - h] = temp;
                }
            }
            h = h / 3;
        }
    }
}
