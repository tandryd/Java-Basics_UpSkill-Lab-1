package com.epam.upskill.module2.arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayProg2 {
    public static void main(String[] args) {
        int myArrayLength;
        int replacementsNumber = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter the length of the array: ");
                myArrayLength = Integer.parseInt(scanner.nextLine());
                if (myArrayLength < 0) {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Incorrect data. Please enter a natural number ");
                continue;
            }
            double[] myArray = ArrayUtils.getArrayDouble(myArrayLength);
            System.out.println(Arrays.toString(myArray));
            System.out.print("Enter number Z: ");
            if (scanner.hasNextDouble()) {
                double z = scanner.nextDouble();
                scanner.close();
                for (int i = 0; i < myArrayLength; i++) {
                    if (myArray[i] > z){
                        myArray[i] = z;
                        replacementsNumber =++replacementsNumber;
                    }
                }
                System.out.println(Arrays.toString(myArray));
                System.out.println("Number of replacement = " + replacementsNumber);
            }
<<<<<<< HEAD
=======
            scanner.close();
>>>>>>> cc005e0755c7068442527919e158e99222b91324
            break;
        }
    }
}
