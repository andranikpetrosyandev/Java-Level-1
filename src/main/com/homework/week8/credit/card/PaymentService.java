package com.homework.week8.credit.card;

public class PaymentService implements Payment{

    @Override
    public void pay(CreditCard creditCard, float amountToBePaid) throws InsufficentBalanceException {
            if(creditCard.getBalance() < amountToBePaid){
                throw new  InsufficentBalanceException("balance on card less then amount");
            }
            creditCard.setBalance(creditCard.getBalance()-amountToBePaid);
    }
}
