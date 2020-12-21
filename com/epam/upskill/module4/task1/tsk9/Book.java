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

public class Book {
    private static int startID = 1;
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublishing;
    private int numberOfPages;
    private double price;
    private String bindingType;

    public Book(String title, String author, String publisher, int yearOfPublishing, int numberOfPages, double price, String bindingType) {
        this.id = startID++;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return String.format("%3d \"%s\", %s, %s, %d year, %d pages, BYN%.2f, binding: %s.",
                id, title, author, publisher, yearOfPublishing, numberOfPages,
                price, bindingType);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }
}

