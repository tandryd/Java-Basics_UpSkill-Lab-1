/*
Создать объект класса Текстовый файл, используя классы Файл, Директория.
Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */
package com.epam.upskill.module5.task1;

import java.util.ArrayList;

public class Directory {
    private String directoryName;
    private ArrayList<TextFile> files;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        files = new ArrayList<>();
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void changeDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public ArrayList<TextFile> getFiles() {
        return files;
    }

    public void addFile(TextFile file) {
        this.files.add(file);
    }

    public void removeFile(String fileName) {
        for (int i = 0; i < files.size(); i++) {
            if(files.get(i).getFileName().equalsIgnoreCase(fileName)) {
                files.remove(i);
            }
        }
    }
}
