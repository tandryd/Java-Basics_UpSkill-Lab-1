package com.epam.upskill.module4.task2.tsk1;

public class TextUtils {
    public TextUtils() {
    }
    public static void printWord(Word word){
        System.out.println(word.getWord());
    }
    public static void printSentence(Sentence sentence){
        String line = "";
        for(Word word : sentence.getSentence()){
            line +=  word.getWord() + " ";
        }
        System.out.println(line);
    }
    public static void printText(Text text){
        System.out.println(text.getHeader());
        for(Sentence sentence: text.getText()) {
            printSentence(sentence);
        }
    }
}
