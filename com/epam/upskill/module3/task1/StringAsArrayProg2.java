/*  Замените в строке все вхождения 'word' на 'letter' */
package com.epam.upskill.module3.task1;

public class StringAsArrayProg2 {
    public static void main(String[] args) {
        String word = "cord word tort word";
        String letter = changeWords(word);
        System.out.println(word);
        System.out.println(letter);
    }

    private static String changeWords(String word) {
        StringBuilder strBuilder = new StringBuilder();
        String[] temp = word.split(" ");
        for (String string: temp) {
            if (string.equals("word")) {
                strBuilder.append("letter");
            } else {
                strBuilder.append(string);
            }
            strBuilder.append(" ");
        }
        return strBuilder.toString();
    }
}
