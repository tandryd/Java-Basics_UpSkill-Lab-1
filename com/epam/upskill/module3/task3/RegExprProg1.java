/*
 Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных операции:
 * отсортировать абзацы по количеству предложений;
 * в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.
 */
package com.epam.upskill.module3.task3;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.regex.Pattern;

public class RegExprProg1 {

    public static void main(String[] args) throws IOException {
//      String pathText = "C:\\text.txt";
//      String text = readUsingFiles(pathText);
        String text =   "First paragraph and one sentence!\n" +
                        "Second paragraph. And two sentences ...\n" +
                        "Third paragraph. And three sentences. Third.\n" +
                        "Fourth paragraph. And six sentences. Third. Fourth. Fifth. Sixth, the longest?\n" +
                        "Fifth paragraph. And five sentences. This is the third. Then the fourth. And finally the fifth.";
        operateWithText(text);
    }

    private static void operateWithText(String text) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String pathStart = "C:\\start.txt";
//        String start = readUsingFiles(pathStart);
        String start =  "- enter \"1\" to sort the paragraphs by the number of sentences;\n" +
                        "- enter \"2\" to sort words by length in each sentence;\n" +
                        "- enter \"3\" to sort lexemes in sentences in descending order\n" +
                        "  occurrences of the given character, and in case of equality, alphabetically.\n" +
                        "Enter \"exit\" to terminate the application.";
        System.out.println(start);
        String pick = "";
        while (!pick.equalsIgnoreCase("exit")) {
            System.out.print("Please, enter command: ");
            pick = reader.readLine();
            switch (pick) {
                case "1" -> sortParagraphs(text);
                case "2" -> sortWords(text);
                case "3" -> sortLexemes(text);
                case "exit" -> System.out.println("\nShutting down");
                default -> System.out.println("Invalid command. Re-enter the command again.\n");
            }
        }
        reader.close();
    }

    private static String readUsingFiles(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    private static String [] splitSentences(String text) {
        Pattern pattern = Pattern.compile("[.!?]"); //добавить троеточие ...
        return pattern.split(text);
    }

    private static String [] splitWords(String sentence) {
        Pattern pattern = Pattern.compile("\\s*(\\s|,|!|\\.)\\s*");
        return pattern.split(sentence);
    }

    private static void sortWords(String text) {
        String [] paragraphs = text.split("\n");
        for (String paragraph : paragraphs) {
            String [] sentences = splitSentences(paragraph);
            for (String sentence : sentences) {
                String [] words = splitWords(sentence);
                for (int i = words.length - 1; i >= 0; i--) {
                    for (int j = 0; j < i; j++) {
                        if (words[j].length() > words[j + 1].length()) {
                            String temp = words[j];
                            words[j] = words[j + 1];
                            words[j + 1] = temp;
                        }
                    }
                }
                for (String  word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b.");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void sortParagraphs (String text) {
        String[] paragraphs = text.split("\n");
        int[] counterSentences = new int[paragraphs.length];
        int maxLengthParagraph = 0;
        for (int i = 0; i < paragraphs.length; i++) {
            String[] sentences = splitSentences(paragraphs[i]);
            counterSentences[i] = sentences.length;
            if (maxLengthParagraph < sentences.length) {
                maxLengthParagraph = sentences.length;
            }
        }
        for (int i = 1; i <= maxLengthParagraph; i++) {
            for (int j = 0; j < counterSentences.length; j++) {
                if (i == counterSentences[j]) {
                    System.out.println(paragraphs[j]);
                }
            }
        }
        System.out.println();
    }
    private static void sortLexemes(String text) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a character to sort: ");
        String letter = reader.readLine();
        String [] paragraphs = text.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentences(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);
                for (int k = words.length - 1; k >= 0; k--) {
                    for (int m = 0; m < k; m++) {
                        int countRight = 0;
                        int countLeft = 0;
                        for (int n = 0; n < words[m].length(); n++) { //считаем количество вхождений символа
                            if (String.valueOf(words[m].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                countLeft++;
                            }
                        }
                        for (int n = 0; n < words[m + 1].length(); n++) {   //считаем количество вхождений следующего символа
                            if (String.valueOf(words[m + 1].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                countRight++;
                            }
                        }
                        if (countLeft < countRight) {   //сравниваем количесво вхождений
                            String tmp = words[m];
                            words[m] = words[m + 1];
                            words[m + 1] = tmp;
                        } else if (countLeft == countRight) { //если количество вхождений равно (но не равно нулю), сортировка по алфавиту
                            String [] forCompare = {words[m], words[m + 1]};
                            Arrays.sort(forCompare);
                            words[m] = forCompare[0];
                            words[m + 1] = forCompare[1];
                        }
                    }
                }
                for (String  word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b.");
            }
            System.out.println();
        }
        System.out.println();
    }

}
