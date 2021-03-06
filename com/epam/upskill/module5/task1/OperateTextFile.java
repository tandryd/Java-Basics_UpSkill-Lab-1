/*
Создать объект класса Текстовый файл, используя классы Файл, Директория.
Методы: создать, переименовать, вывести на консоль содержимое, дополнить,удалить.
 */
package com.epam.upskill.module5.task1;

import java.io.IOException;

public class OperateTextFile {
    public static void main(String[] args) {
        Directory directory = new Directory("D://Text Files");
        String fileName = "What is object-oriented programming";
        TextFile tFile = new TextFile(directory, fileName);
        String line1 = "Object-oriented programming combines a group of variables (properties) " +
                "and functions (methods) into a unit called an \"object.\"";
        tFile.addContent(line1);

        System.out.println("Text files created: \"" + tFile.getFileName() + "\"");

        tFile.changeName("What is OOP");
        System.out.println("The file name is changed to \"" + tFile.getFileName() + "\"");

        System.out.println("\nTest: print content.");
        tFile.printContent();

        System.out.println("\nTest: add content and print.");
        String line2 = "\nThese objects are organized into classes where individual objects can be grouped together. " +
                "\nOOP can help you consider objects in a program's code and the different actions that could happen " +
                "\nin relation to the objects. ";
        tFile.addContent(line2);
        tFile.printContent();

        System.out.println("\nTest: print files of current directory.");
        for (File file : directory.getFiles()) {
            System.out.println(file);
        }

        System.out.println("\nTest: create a new text file and print files of current directory.");
        File tFile2 = new TextFile(directory, "Java For Dummies");
        for (File file : directory.getFiles()) {
            System.out.println(file);
        }

        System.out.println("\nTest: delete a text file and print files of current directory.");
        directory.removeFile("What is OOP");
        for (File file : directory.getFiles()) {
            System.out.println(file);
        }
    }
}
