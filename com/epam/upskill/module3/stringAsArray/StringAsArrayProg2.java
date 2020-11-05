/*  Замените в строке все вхождения 'word' на 'letter' */
package com.epam.upskill.module3.stringAsArray;

public class StringAsArrayProg2 {
    public static void main(String[] args) {
        String word = "cord word tort word";
        String letter = changeWords(word);
        System.out.println(word);
        System.out.println(letter);
    }

    private static String changeWords(String word) {
        StringBuilder strBuilder = new StringBuilder();
        String letter;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'w'
               && word.charAt(i + 1) == 'o'
               && word.charAt(i + 2) == 'r'
               && word.charAt(i + 3) == 'd') {
               strBuilder.append("letter");
                i += 3;
            }   else {
                    strBuilder.append(word.charAt(i));
                }
        }
        letter = strBuilder.toString();

        return letter;
    }
}
