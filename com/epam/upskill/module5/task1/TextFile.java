/*
Создать объект класса Текстовый файл, используя классы Файл, Директория.
Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */
package com.epam.upskill.module5.task1;

public class TextFile extends File{
    private String content;

    TextFile(Directory directory, String fileName) {
        super(directory, fileName);
        content ="";
        directory.addFile(this);
    }

    public void addContent(String text) {
        StringBuilder stringBuilder = new StringBuilder(this.content);
        this.content = stringBuilder.append(text).toString();
    }

    public String getContent() {
        return content;
    }

    public void printContent() {
        System.out.println(getContent());
    }

    @Override
    public void changeName(String fileName) {
        this.setFileName(fileName);
    }
}
