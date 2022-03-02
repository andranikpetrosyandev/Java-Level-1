package com.homework.week8.credit.card;

import com.classroom.week5.set.User;

import java.util.Objects;

public class CreditCard {
    private double balance;
    private String number;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if(!(o instanceof CreditCard)){
            return false;
        }

        CreditCard creditCard = (CreditCard) o;
        return creditCard.number.equals(this.number) && creditCard.balance== this.balance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance, number);
    }

    @Override
    public String toString() {
        return "CreditCard{" + "balance=" + balance + ", number=" + number + '}';
    }
}
