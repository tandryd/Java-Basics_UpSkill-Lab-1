/*  Дан массив названий переменных в camelCase. Преобразовать названия в snake_case. */
package com.epam.upskill.module3.task2;
import java.util.Arrays;

public class StringAsArrayProg1 {

    public static void main(String[] args) {
        String [] camelCase = {"varOne", "varOneTwo", "varOneTwoThree"};
        String [] snakeCase = toSnakeCase(camelCase);
        System.out.println (Arrays.toString(camelCase));
        System.out.println (Arrays.toString(snakeCase));
    }

    private static String [] toSnakeCase (String [] camelCase) {
        String [] snakeCase = new String[camelCase.length];
        for (int i = 0; i < snakeCase.length; i++) {
            StringBuilder strBuilder = new StringBuilder();
            for (int j = 0; j < camelCase[i].length(); j++) {
                char element = camelCase[i].toCharArray()[j];
                if (Character.isLowerCase(element)) {
                    strBuilder.append(element);
                } else {
                    strBuilder.append("_");
                    strBuilder.append(Character.toLowerCase(element));
                }
            }
            snakeCase[i] = strBuilder.toString();
        }
        return snakeCase;
    }
}
