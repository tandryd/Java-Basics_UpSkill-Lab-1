/*Реализуйте сортировку выбором. Метод sort() из класса Arrays я не использую.*/
package com.epam.upskill.module2.sorting;
import java.util.Arrays;
import java.util.Scanner;
import static com.epam.upskill.module2.sorting.SortingUtils.*;
public class SortingProg2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myArrayLength = getMyArrayLength(scanner);
        int [] myArray = getArrayIntFromKeyboard(myArrayLength);
        System.out.println(Arrays.toString(myArray));
        selectionSortUp(myArray);
        System.out.println(Arrays.toString(myArray));
        selectionSortDown(myArray);
        System.out.println(Arrays.toString(myArray));
    }
    private static void selectionSortUp(int[] myArray){
        for (int i = 0; i < myArray.length; i++) {
            int min = myArray[i];
            int minElement = i;
                 for (int j = i+1; j < myArray.length; j++) {
                     if (myArray[j] < min) {
                     min = myArray[j];
                     minElement = j;
                     }
                 }
            if (i != minElement) {
            int temp = myArray[i];
            myArray[i] = myArray[minElement];
            myArray[minElement] = temp;
            }
        }
    }
    private static void selectionSortDown(int[] myArray){
        for (int i = 0; i < myArray.length; i++) {
            int max = myArray[i];
            int maxElement = i;
            for (int j = i+1; j < myArray.length; j++) {
                if (myArray[j] > max) {
                    max = myArray[j];
                    maxElement = j;
                }
            }
            if (i != maxElement) {
                int temp = myArray[i];
                myArray[i] = myArray[maxElement];
                myArray[maxElement] = temp;
            }
        }
    }
}
