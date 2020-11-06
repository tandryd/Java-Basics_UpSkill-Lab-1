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
        boolean isDigit = false;
        char [] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (char element : digits) {
            if (ch == element) {
                isDigit = true;
            }
        }
        return isDigit;
    }

    private static int countNumbers (String line) {
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            if (isDigit(line.charAt(i))) {
                if (i == line.length() - 1 || !isDigit(line.charAt(i + 1))) {
                    counter++;
                }

            }
        }
        return counter;
    }
}
