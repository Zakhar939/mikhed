package by.homework.lessens.task16;

import java.util.Optional;
import java.util.Set;

public class Bank {
    private Set<Account> accounts;

    public Bank(Set<Account> accounts) {
        this.accounts = accounts;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }
//    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount) {
//        Account accountFrom = findAccountByNumber(accountNumberFrom);
//        Account accountTo = findAccountByNumber(accountNumberTo);
//
//        if (accountFrom == null || accountTo == null) {
//            throw new AccountNotFoundException("Account not found", "not.found.account");
//        }
//
//        if (accountFrom.getAmount() < amount) {
//            throw new NotEnoughMoneyException("Not enough money", "not.enough.money");
//        }
//
//        accountFrom.setAmount(accountFrom.getAmount() - amount);
//        accountTo.setAmount(accountTo.getAmount() + amount);
//    }
    //9
public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount, double exchangeRate) {
    Account accountFrom = findAccountByNumber(accountNumberFrom);
    Account accountTo = findAccountByNumber(accountNumberTo);

    if (accountFrom == null || accountTo == null) {
        throw new AccountNotFoundException("Account not found", "not.found.account");
    }

    if (accountFrom.getAmount() < amount) {
        throw new NotEnoughMoneyException("Not enough money", "not.enough.money");
    }

    accountFrom.setAmount(accountFrom.getAmount() - amount);
    accountTo.setAmount(accountTo.getAmount() + amount * exchangeRate);
}

    private Account findAccountByNumber(String accountNumber) {
        Optional<Account> result = accounts.stream()
                .filter(account -> account.getAccountNumber().equals(accountNumber))
                .findFirst();
        return result.orElse(null);
    }
}
