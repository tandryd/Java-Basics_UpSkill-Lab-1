/*В строке найти количество чисел */
package com.epam.upskill.module3.task1;

public class StringAsArrayProg4 {
    public static void main(String[] args) {
        String string = "Schedule of bus №49, Minsk, Pushkinskaya station: \n" +
                "Thursday (weekday) \n" +
                "Сurrent time 3:35 PM \n" +
                "Next ride 3:37 PM";
        System.out.println(countNumbers(string));
    }

    private static boolean isDigit (char ch) {
        return (ch >= '0' && ch <= '9');
    }

    private static int countNumbers (String line) {
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            if (isDigit(line.charAt(i)) && !isDigit(line.charAt(i + 1))) {
                    counter++;
            }
        }
        return counter;
    }
}
