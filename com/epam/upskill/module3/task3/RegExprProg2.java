/*
 * Дана строка, содержащая следующий текст (xml-документ):
 * <notes>
 *    <note id = "1">
 *       <to>Вася</to>
 *       <from>Света</from>
 *       <heading>Напоминание</heading>
 *       <body>Позвони мне завтра!</body>
 *    </note>
 *    <note id = "2">
 *        <to>Петя</to>
 *        <from>Маша</from>
 *        <heading>Важное напоминание</heading>
 *        <body/>
 *    </note>
 * </notes>
 * Напишите анализатор, позволяющий последовательно возвращать содержимое узлов
 * xml-документа и его тип (открывающий тег, закрывающий тег, содержимое тега,
 * тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
 */
package com.epam.upskill.module3.task3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegExprProg2 {
    public static void main(String[] args) {
        String xml = "<notes>\n" +
                "    <note id = \"1\">\n" +
                "        <to>Вася</to>\n" +
                "        <from>Света</from>\n" +
                "        <heading>Напоминание</heading>\n" +
                "        <body>Позвони мне завтра!</body>\n" +
                "    </note>\n" +
                "    <note id = \"2\">\n" +
                "        <to>Петя</to>\n" +
                "        <from>Маша</from>\n" +
                "        <heading>Важное напоминание</heading>\n" +
                "        <body/>\n" +
                "    </note>\n" +
                " </notes> \n";
        String xmlAnalysis = analyzeXml(xml);
        System.out.println(xmlAnalysis);
    }

    private static String analyzeXml(String xml) {
        StringBuilder strBuilder = new StringBuilder();
        Pattern pOpen = Pattern.compile("<[.[^/]]+>");
        Pattern pClose = Pattern.compile("</.+>");
        Pattern pBody = Pattern.compile(">.+<");
        Pattern pEmpty = Pattern.compile("<.+/>");
        String [] lines = xml.split("\n\\s*"); // разбиваем xml построчно
        for (String line : lines) { // проверяем содержимое каждой строки
            Matcher mOpen = pOpen.matcher(line);
            Matcher mClose = pClose.matcher(line);
            Matcher mBody = pBody.matcher(line);
            Matcher mEmpty = pEmpty.matcher(line);
            if (mEmpty.find()) {
                strBuilder.append(mEmpty.group());
                strBuilder.append(" - тег без тела\n");
            }
            if (mOpen.find()) {
                strBuilder.append(mOpen.group());
                strBuilder.append(" - открывающий тег\n");
            }
            if (mBody.find()) {
                strBuilder.append(mBody.group().replaceAll("[><]",""));
                strBuilder.append(" - содержимое тега\n");
            }
            if (mClose.find()) {
                strBuilder.append(mClose.group());
                strBuilder.append(" - закрывающий тег\n");
            }
        }
        return strBuilder.toString();
    }

}
