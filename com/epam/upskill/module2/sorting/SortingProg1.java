/*Заданы два одномерных массива с различным количеством элементов и натуральное число k.
Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
при этом не используя дополнительный массив. Пытался  сделать с изменяемыми параметрами, не получилось, не хватило времени. */
package com.epam.upskill.module2.sorting;
import java.util.Arrays;
public class SortingProg1 {
    public static void main(String[] args) {
        int[] firstArray = new int[]{1, 2, 3, 4, 5, 6};
        int[] secondArray = new int[]{7, 8, 9, 0};
        int k = 5;
        int[] combinedArray = new int[firstArray.length + secondArray.length];
        int temp = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (i == k) {
                for (int j = 0; j< secondArray.length; j++) {
                    combinedArray[i+j] = secondArray[j];
                    temp++;
                }
                combinedArray[temp] = firstArray[i];
                temp++;
            }
            else {
                combinedArray[temp] = firstArray[i];
                temp++;
            }
        }
        System.out.print(Arrays.toString(combinedArray));
    }
}