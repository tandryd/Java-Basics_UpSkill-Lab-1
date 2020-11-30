/*
1. Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
package com.epam.upskill.module4.task2.tsk1;

import java.util.ArrayList;

public class Text {

    private Word heading;
    private ArrayList<Sentence> content;

    Text(Word heading) {
        this.heading = heading;
        this.content = new ArrayList<>();
    }

    Text(Word heading, ArrayList<Sentence> content){
        this.heading = heading;
        this.content = content;
    }

    Text(Word heading, Sentence sentence){
        this.heading = heading;
        this.content = new ArrayList<>();
        this.content.add(sentence);
    }

    void addSentence (Sentence sentence) {
        this.content.add(sentence);
    }

    void printText() {
        for (Sentence sentence : this.content) {
            System.out.print(sentence);
        }
    }

    void printHeading() {
        System.out.println(heading);
    }

    public void setHeading(Word heading) {
        this.heading = heading;
    }

    public Word getHeading() {
        return this.heading;
    }
}
