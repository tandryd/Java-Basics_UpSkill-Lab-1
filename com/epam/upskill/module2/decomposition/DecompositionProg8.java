/*Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.*/
package com.epam.upskill.module2.decomposition;
import java.util.Scanner;
import static com.epam.upskill.module2.decomposition.DecompositionUtils.*;
public class DecompositionProg8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] myArray = new int[] {1,2,3,4,5,6,7,8,9};
        System.out.print("Enter value of start of section: ");
        int startOfSectionK = scanner.nextInt();
        System.out.print("Enter value of end of section: ");
        int endOfSectionM = getIntFromKeyboard(scanner);
        getSumOfThreeElements(startOfSectionK, endOfSectionM, myArray);
        scanner.close();
    }
    private static void getSumOfThreeElements(int startOfSectionK, int endOfSectionM, int[] myArray) {
        int count = 0;
        for (int i = startOfSectionK-1, j = i+1, n=j+1; i < endOfSectionM-2; i++, j++, n++) {
            int sum = myArray[i] + myArray[j] + myArray[n];
            count++;
            System.out.println("Sum of "+ count + "-th three numbers : " + sum);
        }
    }

}
