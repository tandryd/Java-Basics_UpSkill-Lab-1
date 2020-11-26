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

public class OperateBookStore {
    public static void main(String[] args) {
        BookStore biblio = new BookStore("Biblio.by", new ArrayList<>());
        biblio.addBook("White Fang", " Jack London", "Scholastic Paperbacks",
                2001, 252, 22.78f, "hardcover");
        biblio.addBook("Adventures and Misadventures of Maqroll", "Alvaro Mutis", "New York Review of Books",
                2002, 720, 20.12f, "paperback");
        biblio.addBook("Long Ships", "Michael Chabon", "New York Review of Books",
                2010, 528, 16.16f, "paperback");
        biblio.addBook("Fahrenheit 451", "Ray Bradbury", "Simon & Schuster",
                2011, 256, 14.20f, "paperback");
        biblio.addBook("Amazing Adventures of Kavalier and Clay", "Michael Chabon", "Random House Publishing Group",
                2012, 704, 15.53f, "paperback");

        ArrayList<Book> allBooks = biblio.getBookList();
        System.out.println("The Biblio.by store has the following books: ");
        for (Book book: allBooks) {
            System.out.println(book);
        }

        System.out.println("\nBooks by Michael Chabon in the Biblio.by store:");
        ArrayList<Book> autorsBook = biblio.getAuthorBook("Michael Chabon");
        for (Book book : autorsBook) {
            System.out.println(book);
        }

        System.out.println("\nBooks published by \"New York Review of Books\":");
        ArrayList<Book> publishersBook = biblio.getPublisherBook("New York Review of Books");
        for (Book book : publishersBook) {
            System.out.println(book);
        }

        System.out.println("\nBooks released after 2010:");
        ArrayList<Book> releasedAfter = biblio.showReleasedAfter(2010);
        for (Book book : releasedAfter) {
            System.out.println(book);
        }
    }
}
