package by.homework.lessens.task16;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(1, "счёт1", "USD", 500.0);
        Account account2 = new Account(2, "счёт2", "BYN", 40.0);
        Account account3 = new Account(3, "счёт3", "BYN", 300.0);
        Account account4 = new Account(4, "счёт4", "USD", 400.0);
        Account account5 = new Account(5, "счёт5", "BYN", 500.0);

        Set<Account> accounts = new HashSet<>();
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);
        accounts.add(account5);

        Bank bank = new Bank(accounts);

//        for (Account account : bank.getAccounts()) {
//            System.out.println(account.getAccountNumber() + " = " + account.getAmount());
//        }
//
//        try {
//            bank.transferMoney("счёт1", "счёт2", 52.0);
//        } catch (AccountNotFoundException e) {
//            System.out.println("Откройте счёт в нашем банке для выполнения переводов");
//        } catch (NotEnoughMoneyException e) {
//            System.out.println("Недостаточно средств для перевода");
//        } finally {
//            System.out.println("Спасибо,что вопользовались услугами банка");
//        }
//
//        for (Account account : bank.getAccounts()) {
//            System.out.println(account.getAccountNumber() + " = " + account.getAmount());
//        }
        //9
        for (Account account : bank.getAccounts()) {
            System.out.println(account.getCurrency() + ": " + account.getAccountNumber() + " = " +  account.getAmount());
        }

        try {
            bank.transferMoney("счёт1", "счёт2", 50.0, 3.2);
        } catch (AccountNotFoundException e) {
            System.out.println("Откройте счёт в нашем банке для выполнения переводов");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Недостаточно средств для перевода");
        } finally {
            System.out.println("Спасибо,что вопользовались услугами банка");
        }

        for (Account account : bank.getAccounts()) {
            System.out.println(account.getCurrency() + ": " + account.getAccountNumber() + " = " +  account.getAmount());
        }
    }
}
