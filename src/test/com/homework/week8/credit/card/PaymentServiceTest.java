package com.homework.week8.credit.card;

import com.classroom.week8.exception.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceTest {

    @Test
    public void testWhenCardBalanceLessThenToBePaid() {

        InsufficentBalanceException exception = Assertions.assertThrows(InsufficentBalanceException.class, new Executable() {
            @Override
            public void execute() throws InsufficentBalanceException {
                CreditCard creditCard = new CreditCard();
                creditCard.setBalance(100);
                PaymentService paymentService = new PaymentService();
                paymentService.pay(creditCard, 150);
            }
        });
        Assertions.assertEquals("balance on card less then amount", exception.getMessage());
    }

    @Test
    public void testWhenCharegeAmountMoreThenBalanceOnCard(){
        InsufficentBalanceException exception = Assertions.assertThrows(InsufficentBalanceException.class, new Executable() {
            @Override
            public void execute() throws InsufficentBalanceException {
                CreditCard creditCard = new CreditCard();
                creditCard.setBalance(100);
                PaymentService paymentService = new PaymentService();
                paymentService.pay(creditCard, 30);
                paymentService.pay(creditCard, 30);
                paymentService.pay(creditCard, 30);
                paymentService.pay(creditCard, 30);
            }
        });
        Assertions.assertEquals("balance on card less then amount", exception.getMessage());
    }
}