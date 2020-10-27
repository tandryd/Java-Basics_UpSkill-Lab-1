/*Заданы два одномерных массива с различным количеством элементов и натуральное число k.
Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
при этом не используя дополнительный массив. Пытался  сделать с изменяемыми параметрами, не получилось, не хватило времени. */
package com.epam.upskill.module2.sorting;
import java.util.Arrays;
public class SortingProg1 {
    public static void main(String[] args) {
                int[] firstArray = new int[]{1, 2, 3, 4, 5, 6};
        int[] secondArray = new int[]{7, 8, 9, 0};
        int k = 2;
        int[] combinedArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, combinedArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, combinedArray, firstArray.length, secondArray.length);
        int temp;
        for (int i = 0; i < secondArray.length; i++) {
            int temp1 = i + k;
            int temp2 = combinedArray[temp1];
            combinedArray[temp1] = combinedArray[temp1 + secondArray.length];
            combinedArray[temp1 + secondArray.length] = temp2;
        }
        System.out.print(Arrays.toString(combinedArray));
    }
}