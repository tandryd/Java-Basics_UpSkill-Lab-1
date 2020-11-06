/* В строке найти количество цифр.*/
package com.epam.upskill.module3.task1;

public class StringAsArrayProg3 {
    public static void main(String[] args) {
        String string = "Schedule of bus №49, Minsk, Pushkinskaya station: \n" +
                "Thursday (weekday) \n" +
                "Сurrent time 3:35 PM \n" +
                "Next ride 3:37 PM";
        System.out.println(string);
        System.out.println("Number of digits in a string: " + countDigits(string));
    }
    private static int countDigits(String string) {
        int count = 0;
        char [] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < string.length(); i++) {
            for (char element : digits) {
                if (string.charAt(i) == element) {
                    count++;
                }
            }
        }
        return count;
    }
}
