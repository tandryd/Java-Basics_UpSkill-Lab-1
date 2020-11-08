/* В строке вставить после каждого символа 'a' символ 'b'.*/
package com.epam.upskill.module3.task2;

public class StringAsStringProg2 {

    public static void main(String[] args) {
        String text = "Monsters stalking through the night.\n" +
                "Halloween is the Night of Fright.\n" +
                "Rough winds do shake the darling buds of May,\n" +
                "A Fear is what this night brings,\n" +
                "Along with many other things.";
        System.out.println(addSymbol(text));
    }

    private static String addSymbol (String text) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                strBuilder.append("ab");
            } else {
                strBuilder.append(text.charAt(i));
            }
        }
        return strBuilder.toString();
    }
}
