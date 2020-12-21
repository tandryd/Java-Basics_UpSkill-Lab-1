/*
1. Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

package com.epam.upskill.module4.task2.tsk1;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<Word> sentence;

    public Sentence() {
        this.sentence = new ArrayList<>();
    }

    public List<Word> addWord(Word word){
        sentence.add(word);
        return sentence;
    }

    public List<Word> deleteWord(Word word){
        sentence.remove(word);
        return sentence;
    }

    public List<Word> getSentence() {
        return sentence;
    }

    public void setSentence(List<Word> sentence) {
        this.sentence = sentence;
    }

}
