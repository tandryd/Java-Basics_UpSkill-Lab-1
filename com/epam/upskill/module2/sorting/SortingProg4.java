/*Реализуйте сортировку вставками. */
package com.epam.upskill.module2.sorting;
import java.util.Arrays;
import java.util.Scanner;
import static com.epam.upskill.module2.sorting.SortingUtils.*;
public class SortingProg4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myArrayLength = getMyArrayLength(scanner);
        int[] myArray = getArrayRandom(myArrayLength);
        System.out.println(Arrays.toString(myArray));
        insertionSortUp(myArray);
        System.out.println(Arrays.toString(myArray));
        insertionSortDown(myArray);
        System.out.println(Arrays.toString(myArray));
    }
    private static void insertionSortUp(int[] myArray) {
        int temp;
        for (int i = 1; i < myArray.length; i++) {
            temp = myArray[i];
            int j = i - 1;
            while (j >= 0 && myArray[j] > temp) {
                myArray[j + 1] = myArray[j];
                j = j - 1;
            }
            myArray[j + 1] = temp;
        }
    }
    private static void insertionSortDown(int[] myArray) {
        int temp;
        for (int i = 1; i < myArray.length; i++) {
            temp = myArray[i];
            int j = i - 1;
            while (j >= 0 && myArray[j] < temp) {
                myArray[j + 1] = myArray[j];
                    j = j - 1;
            }
                myArray[j + 1] = temp;
        }
    }
}
