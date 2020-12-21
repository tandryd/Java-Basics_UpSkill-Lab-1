/*
Создать объект класса Текстовый файл, используя классы Файл, Директория.
Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */
package com.epam.upskill.module5.task1;
import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String directoryName;
    private final List<File> files;

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

        public List<File> getFiles() {
        return files;
    }


    public void addFile(File file) {
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
