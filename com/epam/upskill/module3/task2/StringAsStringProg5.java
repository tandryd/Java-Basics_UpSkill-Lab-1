/*Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.*/
package com.epam.upskill.module3.task2;

public class StringAsStringProg5 {

    public static void main(String[] args) {
        String poem = "Trick or Treat! Trick or Treat! \n"+
                "Give me something good to eat. \n"+
                "Give me candy. Give me cake. \n"+
                "Give me something good to take.";
        System.out.println(countCharacter(poem, 'a'));
    }

    private static int countCharacter(String text, char ch) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                counter++;
            }
        }
        return counter;
    }
}
