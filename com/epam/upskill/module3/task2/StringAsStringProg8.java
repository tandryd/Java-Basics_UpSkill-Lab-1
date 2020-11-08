/*
 Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
 Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 */
package com.epam.upskill.module3.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringAsStringProg8 {

    public static void main(String[] args) throws IOException {
        String text = getStringFromKeyboard();
        System.out.println("The longest word - " + findLongestWord(text));
    }

    public static String getStringFromKeyboard () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type some text from keyboard:");
        String text = reader.readLine();
        reader.close();
        return text;
    }

    private static String findLongestWord (String text) {
        String longestWord = null;
        int maxLenght = 0;
        String [] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxLenght) {
                maxLenght = words[i].length();
                longestWord = words[i];
            }
        }
        return longestWord;
    }
}
