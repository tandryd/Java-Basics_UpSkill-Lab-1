/*Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.*/
package com.epam.upskill.module3.stringAsArray;

public class StringAsArrayProg5 {
    public static void main(String[] args) {
        String halloween = "      Halloween   or   Hallowe'en   is   a   celebration \n" +
                "observed  in   many   countries on   31   October, the   eve   of   \n" +
                "the   Western    Christian    feast    of    All     Hallows'Day.    ";
        System.out.println(removeExtraSpaces(halloween));
    }

    private static String removeExtraSpaces(String halloween) {
        StringBuilder strBuilder = new StringBuilder();
        String string = halloween.trim();
        boolean isSpace = false;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                if (!isSpace) {
                    strBuilder.append(" ");
                }
                isSpace = true;
            } else {
                strBuilder.append(string.charAt(i));
                isSpace = false;
            }
        }
        return strBuilder.toString();
    }
}
