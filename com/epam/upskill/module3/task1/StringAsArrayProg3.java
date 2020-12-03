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
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= '0' && string.charAt(i) <= '9') {
                count++;
            }
        }
        return count;

    }
}
