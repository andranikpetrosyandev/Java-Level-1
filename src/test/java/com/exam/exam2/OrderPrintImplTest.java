package com.exam.exam2;

import org.junit.jupiter.api.Test;

import java.security.PublicKey;

import static org.junit.jupiter.api.Assertions.*;

class OrderPrintImplTest {

    @Test
    public void printOrderById() {
        OrderPrintImpl orderPrint = new OrderPrintImpl();
        orderPrint.printOrder(2);
    }

    @Test
    public void printOrderList() {
        OrderPrintImpl orderPrint = new OrderPrintImpl();
        orderPrint.printOrderList(1,9);
    }

}