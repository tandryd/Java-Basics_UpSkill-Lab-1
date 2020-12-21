/*
1. Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
package com.epam.upskill.module4.task2.tsk1;

public class OperateText {
    public static void main(String[] args) {
        Word w1 = new Word("In");
        Word w2 = new Word("the");
        Word w3 = new Word("other");
        Word w4 = new Word("gardens");
        Word w5 = new Word("and");
        Word w6 = new Word("all");
        Word w7 = new Word("up");
        Word w8 = new Word("the");
        Word w9 = new Word("vale");

        Sentence s1 = new Sentence();
        s1.addWord(w1);
        s1.addWord(w2);
        s1.addWord(w3);
        s1.addWord(w4);
        s1.addWord(w5);
        s1.addWord(w6);
        s1.addWord(w7);
        s1.addWord(w8);
        s1.addWord(w9);

        Word w10 = new Word("From");
        Word w11 = new Word("the");
        Word w12 = new Word("autumn");
        Word w13 = new Word("bonfires");
        Word w14 = new Word("see");
        Word w15 = new Word("the");
        Word w16 = new Word("smoke");
        Word w17 = new Word("trail");

        Sentence s2 = new Sentence();
        s2.addWord(w10);
        s2.addWord(w11);
        s2.addWord(w12);
        s2.addWord(w13);
        s2.addWord(w14);
        s2.addWord(w15);
        s2.addWord(w16);
        s2.addWord(w17);

        Text t1 = new Text("Autumn Fires");
        t1.addSentence(s1);
        t1.addSentence(s2);

        TextUtils.printWord(w1);
        TextUtils.printSentence(s1);
        TextUtils.printText(t1);
    }
}
