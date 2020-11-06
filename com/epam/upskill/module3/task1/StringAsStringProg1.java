/* Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем. */
package com.epam.upskill.module3.stringAsString;
public class StringAsStringProg1 {
    public static void main(String[] args) {
        String text = "Monsters stalking through the night.\n" +
                "Halloween is      the   Night    of Fright.\n" +
                "Rough winds do  shake the darling buds of May,\n" +
                "AFear is what               this night brings,\n" +
                "Along with many  other things.";
        int moreSpaces = findSpaces(text);
        System.out.println(moreSpaces);
    }

    private static int findSpaces(String line) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                count++;
            } else {
                if (maxCount < count) {
                    maxCount = count;
                }
                count = 0;
            }
        }
        return maxCount;
    }
}
