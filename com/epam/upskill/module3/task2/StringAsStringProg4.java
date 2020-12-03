/* С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”. */
package com.epam.upskill.module3.task2;
public class StringAsStringProg4 {

    public static void main(String[] args) {
        String informatics = "информатика";
        System.out.println(makeWord(informatics));
    }
    private static String makeWord (String word) {
        String cake = String.valueOf(word.charAt(word.indexOf('т')));
        cake += String.valueOf(word.charAt(word.indexOf('о')));
        cake += String.valueOf(word.charAt(word.indexOf('р')));
        cake += String.valueOf(word.charAt(word.indexOf('т')));
        return cake;
    }
}
