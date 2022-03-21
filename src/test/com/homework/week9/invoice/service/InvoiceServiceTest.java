package com.homework.week9.invoice.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceServiceTest {
    private InvoiceService testObject;

    @BeforeEach
    public void makeInvoceObject() {
        testObject = new InvoiceService();
    }

    @Test
    public void testTotalAmountByTypeSAD() {
        Assertions.assertEquals(2602704070L, testObject.totalAmountByType(InvoiceType.SAD));
    }

    @Test
    public void testGetBySADType() {
        Invoice[] invoices = testObject.getByType(InvoiceType.SAD);
        for (Invoice invoice : invoices) {
            Assertions.assertEquals(InvoiceType.SAD, invoice.getInvoiceType());
        }
    }

    @Test
    public void testGetByMANType() {
        Invoice[] invoices = testObject.getByType(InvoiceType.MAN);
        for (Invoice invoice : invoices) {
            Assertions.assertEquals(InvoiceType.MAN, invoice.getInvoiceType());
        }
    }

    @Test
    public void getBySADTypeAndCode() {
        Invoice[] invoices =  testObject.getByTypeAndCode(InvoiceType.MAN, "GUCE-CUSTOMS");
        for (Invoice invoice : invoices) {
            Assertions.assertEquals(InvoiceType.MAN, invoice.getInvoiceType());
            Assertions.assertEquals("GUCE-CUSTOMS", invoice.getCode());
        }
    }

}