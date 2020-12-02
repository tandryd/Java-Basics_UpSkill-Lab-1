/*
Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 */
package com.epam.upskill.module3.task2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class StringAsStringProg7 {

    public static void main(String[] args) throws IOException {
        String text = getStringFromKeyboard();
        System.out.println(removeReplays(removeSpaces(text)));
    }

    public static String getStringFromKeyboard () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type some text from keyboard:");
        String text = reader.readLine();
        reader.close();
        return text;
    }

    private static String removeSpaces(String text) {
        return text.replace(" ", "");
    }

    private static String removeReplays (String text) {
        StringBuilder strBuilder = new StringBuilder(text);
        for (int i = 0; i < strBuilder.length(); i++) {
            char ch = strBuilder.charAt(i);
            for (int j = i + 1; j < strBuilder.length(); j++) {
                if (strBuilder.charAt(j) == ch) {
                    strBuilder.deleteCharAt(j);
                }
            }
        }
        return  strBuilder.toString();
    }
}
