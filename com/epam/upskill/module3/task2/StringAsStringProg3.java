/* Проверить, является ли заданное слово палиндромом.
P.S. Палиндром – это слово, фраза или число, которые одинаково читаются слева направо и справа налево. */
package com.epam.upskill.module3.task2;

public class StringAsStringProg3 {

    public static void main(String[] args) {
        String [] words = {"Radar", "Repaper", "civic", "Palindrome", "Step on no pets"};
        for (String word : words) {
            String result = isPalindrome(word) ? " - palindrome" : " - not palindrome";
            System.out.println(word + result);
        }
    }
    private static boolean isPalindrome (String word) {
        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2; i++) {
            String a = String.valueOf(word.charAt(i));
            String b = String.valueOf(word.charAt(word.length() - i - 1));
            if (!a.equalsIgnoreCase(b)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

}
