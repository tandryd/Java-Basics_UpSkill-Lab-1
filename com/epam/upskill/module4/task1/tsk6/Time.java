/*
Составьте описание класса для представления времени.
Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда)
с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается
в значение 0. Создать методы изменения времени на заданное количество часов, минут и секунд.
 */
package com.epam.upskill.module4.task1.tsk6;
public class Time {
    private int hour;
    private int minute;
    private int second;

    private Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    private void setHour(int hour) {
        if (hour > 23 || hour < 0) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    private void setMinute(int minute) {
        if (minute > 59 || minute < 0) {
            this.minute = 0;
        } else {
            this.minute = minute;
        }
    }

    private void setSecond(int second) {
        if (second > 59 || second < 0) {
            this.second = 0;
        } else {
            this.second = second;
        }
    }

    private void changeHour(int hour) {
        this.hour = (this.hour + hour) % 24;
        if (this.hour < 0) {
            this.hour += 24;
        }
    }

    private void changeMinute(int minute) {
        if ((this.minute + minute) < 0) {
            changeHour(minute / 60 );
            this.minute = 60 + ((this.minute + minute) % 60);
        } else {
            changeHour((this.minute + minute) / 60);
            this.minute = (this.minute + minute) % 60;
        }
    }

    private void changeSecond(int second) {
        if ((this.second + second) < 0) {
            changeMinute(second/60);
            this.second = 60 + ((this.second + second) % 60);
        } else {
            changeMinute((this.second + second) / 60);
            this.second = (this.second + second) % 60;
        }
    }

    private String getTime() {
        return String.format("%d:%d:%d", hour, minute, second);
    }

    public static void main(String[] args) {

        Time time = new Time(25, 65, 65);
        System.out.println("Initial time: " + time.getTime());

        System.out.print("time.setSecond(55): ");
        time.setSecond(55);
        System.out.println(time.getTime());

        System.out.print("time.setMinute(59): ");
        time.setMinute(59);
        System.out.println(time.getTime());

        System.out.print("time.setHour(23): ");
        time.setHour(23);
        System.out.println(time.getTime());

        System.out.print("time.changeHour(+2): ");
        time.changeHour(2);
        System.out.println(time.getTime());

        System.out.print("time.changeMinute(-61): ");
        time.changeMinute(-61);
        System.out.println(time.getTime());

        System.out.print("time.changeSecond(-61): ");
        time.changeSecond(-61);
        System.out.println(time.getTime());
    }
}
