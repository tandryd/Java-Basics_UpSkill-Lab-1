/*
Из заданной строки получить новую, повторив каждый символ дважды.
 */
package com.epam.upskill.module3.task2;

public class StringAsStringProg6 {

    public static void main(String[] args) {
        String text = "Trick or Treat! Trick or Treat!\n"+
                "Give me something good to eat.\n"+
                "Give me candy. Give me cake.\n"+
                "Give me something good to take.";
        System.out.println(repeatCharacter(text, 2));
    }

    private static String repeatCharacter (String text, int factor) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < factor; j++) {
                strBuilder.append(text.charAt(i));
            }
        }
        return strBuilder.toString();
    }
}
