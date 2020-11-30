/*
1. Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
package com.epam.upskill.module4.task2.tsk1;

public class OperateText {
    public static void main(String[] args) {
        Word heading = new Word("Lufthansa trials lie-flat economy seat concept");
        String line1 = "With social distancing at forefront of everyone's minds," +
                "having your own space on an airplane has never been so important.\n";
        Sentence sentence = new Sentence(line1);
        Text aPieceOfNews = new Text(heading, sentence);
        String line2 = "But would you pay extra to spread out over a row of economy seats? " +
                "Lufthansa hopes so.\n";
        String line3 = "The German airline is trialing its new Sleeper's Row concept on its" +
                "Frankfurt, Germany to São Paulo, Brazil flights from November 18 to mid-December. " +
                "The idea is passengers traveling in economy can nab a row of three to four seats, " +
                "and then stretch out across them, replicating the experience of a lie-flat business class bed.";
        aPieceOfNews.addSentence(new Sentence(line2));
        aPieceOfNews.addSentence(new Sentence(line3));
        aPieceOfNews.printHeading();
        aPieceOfNews.printText();
    }
}
