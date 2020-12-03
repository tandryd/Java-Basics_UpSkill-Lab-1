/*
Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
восклицательным или вопросительным знаком. Определить количество предложений в строке X.
 */
package com.epam.upskill.module3.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringAsStringProg10 {
    public static void main(String[] args) throws IOException {
        String text = getStringFromKeyboard();
        System.out.println("Number of sentences in text - " + countSentences(text));
    }

    public static String getStringFromKeyboard () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type some text from keyboard:");
        String text = reader.readLine();
        reader.close();
        return text;
    }

    private static int countSentences (String text) {
        int counter = 1;
        char [] marks = {'.', '!', '?'};
        for (int i = 0; i < text.length() - 1; i++) {
            char character = text.charAt(i);
            for (char mark : marks) {
                if (character == mark) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
