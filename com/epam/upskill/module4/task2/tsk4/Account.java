/*
4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
package com.epam.upskill.module4.task2.tsk4;

public class Account {
    private static long startId = 1;
    private long id;
    private double balance;
    private boolean isOpen = true;

    public Account(double balance) {
        this.balance = balance;
        this.id = startId++;
    }

    public long getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public String getStatus() {
        String status = isOpen ? "Unlocked" : "Blocked";
        return String.format("Account %d %s.", id, status);
    }

    public void block(){
        isOpen = false;
    }

    public void unlock() {
        isOpen = true;
    }
}
