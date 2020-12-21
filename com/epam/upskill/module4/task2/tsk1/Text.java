/*
1. Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
package com.epam.upskill.module4.task2.tsk1;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private List<Sentence> text;
    private String header;

    public Text(String header) {
        this.header = header;
        this.text = new ArrayList<>();
    }

    public List<Sentence> addSentence(Sentence sentence){
        text.add(sentence);
        return text;
    }
    public List<Sentence> deleteSentence(Sentence sentence){
        text.remove(sentence);
        return text;
    }

    public List<Sentence> getText() {
        return text;
    }

    public void setText(List<Sentence> text) {
        this.text = text;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @Override
    public String toString() {
        return "Text{" +
                "text=" + text +
                ", header='" + header + '\'' +
                '}';
    }
}
