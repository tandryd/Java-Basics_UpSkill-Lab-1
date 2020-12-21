/*
4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
package com.epam.upskill.module4.task2.tsk4;

import java.util.ArrayList;
import java.util.Comparator;

public class Client {

    private String firstName;
    private String lastName;
    private String passportID;
    private ArrayList<Account> accounts;

    public Client(String firstName, String lastName, String passportID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportID = passportID;
        accounts = new ArrayList<>();
    }

    public String getBalance() {
        double balance = 0;
        for (Account account : accounts) {
            balance += account.getBalance();
        }
        return String.format("%.2f euro", balance);
    }

    public String getBalancePositiveAccounts() {
        double balance = 0;
        for (Account account : accounts) {
            if (account.getBalance() > 0) {
                balance += account.getBalance();
            }
        }
        return String.format("%.2f euro", balance);
    }

    public String getBalanceNegativeAccounts() {
        double balance = 0;
        for (Account account : accounts) {
            if (account.getBalance() < 0) {
                balance += account.getBalance();
            }
        }
        return String.format("%.2f euro", balance);
    }

    public void sortAccountsByBalance() {
        accounts.sort(Comparator.comparing(Account::getBalance));
    }

    public Account getAccount (long id) {
        for (Account client : accounts) {
            if (client.getId() == id) {
                return client;
            }
        }
        return null;
    }

    public void openAccount (Account account) {
        accounts.add(account);
    }

    public void blockAccount (long id) {
        for (Account account : accounts) {
            if(account.getId() == id) {
                account.block();
            }
        }
    }

    public void unlockAccount (long id) {
        for (Account account : accounts) {
            if(account.getId() == id) {
                account.unlock();
            }
        }
    }

    public String getInformation () {
        String information = "";
        for (Account account : accounts) {
            information += String.format("#%d, balance: %.2f euro, status: %s\n", account.getId(), account.getBalance(), account.getStatus());
        }
        return String.format("Client %s has accounts:\n%s", toString(), information);
    }

    public String getPassportID() {
        return passportID;
    }

    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("%s %s, Passport: %s", firstName, lastName, passportID);
    }





}
