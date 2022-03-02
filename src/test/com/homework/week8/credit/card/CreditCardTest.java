package com.homework.week8.credit.card;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    @Test
    public void testWhenCreditCardEquals(){
        CreditCard creditCard = new CreditCard();
        creditCard.setNumber("124522562457548");
        creditCard.setBalance(12.5);

        CreditCard creditCard2 = new CreditCard();
        creditCard2.setNumber("124522562457548");
        creditCard2.setBalance(12.5);
        Assertions.assertEquals(true,creditCard.equals(creditCard2));
    }
    @Test
    public void testToStringMethod(){
        CreditCard creditCard = new CreditCard();
        creditCard.setNumber("124522562457548");
        creditCard.setBalance(12.5);
        Assertions.assertEquals("CreditCard{balance=12.5, number=124522562457548}",creditCard.toString());
    }
}