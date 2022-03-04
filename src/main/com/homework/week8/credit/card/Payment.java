package com.homework.week8.credit.card;

public interface Payment {
    void pay(CreditCard creditCard, float amountToBePaid) throws InsufficentBalanceException;
}
