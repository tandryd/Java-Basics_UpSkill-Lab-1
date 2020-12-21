/*
4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
package com.epam.upskill.module4.task2.tsk4;

public class OperateBank {
    public static void main(String[] args) {
        Bank randomBank = new Bank("Deutsche Bank");
        Client petrov = new Client("Alex", "Petrov", "KK2207875");
        Client ivanov = new Client("Nikolai","Ivanov","PP2331332");

        randomBank.addNewClient(petrov);
        randomBank.addNewClient(ivanov);

        petrov.openAccount(new Account(105.25));
        petrov.openAccount(new Account(200.99));
        petrov.openAccount(new Account(-500.01));
        petrov.openAccount(new Account(300.13));

        ivanov.openAccount(new Account(150.80));
        ivanov.openAccount(new Account(-100.75));
        ivanov.openAccount(new Account(1000.23));
        ivanov.openAccount(new Account(500.08));

        //lock check
        System.out.println(randomBank.getClient("KK2207875").getAccount(3).getStatus());
        randomBank.getClient("KK2207875").blockAccount(3);
        System.out.println(randomBank.getClient("KK2207875").getAccount(3).getStatus() + "\n");

        //sorting check
        System.out.println(randomBank.getClient("KK2207875").getInformation());
        randomBank.getClient("KK2207875").sortAccountsByBalance();
        System.out.println(randomBank.getClient("KK2207875").getInformation());
        randomBank.getClient("PP2331332").sortAccountsByBalance();
        System.out.println(randomBank.getClient("PP2331332").getInformation());

        //print the total balance
        System.out.println(petrov.toString() + ", total balance: " + petrov.getBalance());
        System.out.println(ivanov.toString() + ", total balance: " + ivanov.getBalance());

        //print balance of positive accounts
        System.out.println();
        System.out.println(petrov.toString() + ", positive balance: " + petrov.getBalancePositiveAccounts());
        System.out.println(ivanov.toString() + ", positive balance: " + ivanov.getBalancePositiveAccounts());

        //print balance of negative accounts
        System.out.println();
        System.out.println(petrov.toString() + ", negative balance: " + petrov.getBalanceNegativeAccounts());
        System.out.println(ivanov.toString() + ", negative balance: " + ivanov.getBalanceNegativeAccounts());
    }
}
