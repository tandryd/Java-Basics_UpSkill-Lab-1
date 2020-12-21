/*
9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод  toString().
Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */
package com.epam.upskill.module4.task1.tsk9;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private String bookStoreName;
    private ArrayList<Book> bookList;

    public BookStore(String bookStoreName, ArrayList<Book> bookList) {
        this.bookStoreName = bookStoreName;
        this.bookList = bookList;
    }

    void addBookInStore(Book book) {
        this.bookList.add(book);
    }

    List<Book> getAuthorBook (String author){
        ArrayList<Book> authorList = new ArrayList<>();
        for (Book book:this.bookList) {
            if (book.getAuthor().equalsIgnoreCase(author)){
                authorList.add(book);
            }
        }
        return authorList;
    }

    ArrayList <Book> getPublisherBook (String publisher){
        ArrayList<Book> publisherList = new ArrayList<>();
        for (Book book: this.bookList) {
            if (book.getPublisher().equalsIgnoreCase(publisher)){
                publisherList.add(book);
            }
        }
        return publisherList;
    }

    ArrayList<Book> showReleasedAfter(int year) {
        ArrayList<Book> releasedAfterList = new ArrayList<>();
        for (Book book : this.bookList) {
            if (book.getYearOfPublishing() > year) {
                releasedAfterList.add(book);
            }
        }
        return releasedAfterList;
    }

    public String getBookStoreName() {
        return bookStoreName;
    }

    public void setBookStoreName(String bookStoreName) {
        this.bookStoreName = bookStoreName;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }
}
