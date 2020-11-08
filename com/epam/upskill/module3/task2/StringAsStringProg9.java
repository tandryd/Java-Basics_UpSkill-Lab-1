/*
Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы.
 */
package com.epam.upskill.module3.task2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringAsStringProg9 {

    public static void main(String[] args) throws IOException {
        String text = getStringFromKeyboard();
        System.out.println("Number of characters in lower case - " + countLowerCase(text));
        System.out.println("Number of characters in upper case - " + countUpperCase(text));
    }

    public static String getStringFromKeyboard () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type some text from keyboard:");
        String text = reader.readLine();
        reader.close();
        return text;
    }

    private static int countLowerCase (String text) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (letter >= 'a' && letter <= 'z') {
                counter++;
            }
        }
        return counter;
    }

    private static int countUpperCase (String text) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (letter >= 'A' && letter <= 'Z') {
                counter++;
            }
        }
        return counter;
    }
}
