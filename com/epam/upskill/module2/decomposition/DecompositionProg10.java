/*Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.*/
package com.epam.upskill.module2.decomposition;
import java.util.Arrays;
import java.util.Scanner;

import static com.epam.upskill.module2.decomposition.DecompositionUtils.*;
public class DecompositionProg10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int natural = getNaturalFromKeyboard(scanner) ;
        int [] myArray = new int[10];
        fillArray(natural, myArray);
        System.out.println(Arrays.toString(myArray));
        scanner.close();
    }

    private static int [] fillArray(int natural, int[] myArray) {
        int temp = natural;
        int count=0;
        while (natural!=0){
            natural = natural/10;
            count++;
        }
        int [] tempArray = new int[count];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray [i] = temp%10;
            temp=temp/10;
        }
        int j = count-1;
        for (int i = 0; i < myArray.length; i++) {
           if (j ==-1) {
               j = count-1;
           }
               int n = tempArray [j];
               myArray [i] = n;
               j--;
        }
        return myArray;
    }
}
