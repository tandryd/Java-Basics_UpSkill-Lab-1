/*
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.
 */
package com.epam.upskill.module5.task4;
import com.epam.upskill.module5.task4.action.ConsoleMenuAction;

public class Main {

    public static void main(String[] args) {
        ConsoleMenuAction consoleMenu = new ConsoleMenuAction();
        consoleMenu.startConsoleMenu();
    }

}
