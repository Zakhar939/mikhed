package by.homework.lessens.task16;

import java.util.Objects;

public class Account {
    private int id;
    private String accountNumber;
    private String currency;
    private Double amount;

    public Account(int id, String accountNumber, String currency, Double amount) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id) &&
                Objects.equals(accountNumber, account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountNumber);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id: " + id +
                ", номер счёта: " + accountNumber  +
                ", валюта счёта " + currency  +
                ", сумма на счёте: " + amount ;
    }
}
