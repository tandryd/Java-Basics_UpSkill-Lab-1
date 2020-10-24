package com.epam.upskill.module2.arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayProg6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myArrayLength = ArrayUtils.getMyArrayLength(scanner);
        int [] myArray = ArrayUtils.getArrayIntFromKeyboard(myArrayLength);
        System.out.println(Arrays.toString(myArray));
        for (int i =0; i < myArray.length; i++) {
            if (checkSimple(i))
                System.out.print(myArray[i-1] + " ");
        }
    }
    public static boolean checkSimple(int i){
        if (i<=1)
            return false;
        else if (i <=3)
            return true;
                else if (i%2==0 || i %3 ==0)
                    return false;
        int n = 5;
        while (n*n <=i){
            if (i % n ==0 || i % (n+2) == 0)
                return false;
                n=n+6;
        }
        return true;
    }
}
