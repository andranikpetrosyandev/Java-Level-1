package com.homework.week11.repository.invoice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertThrows;

class HashSetInvoiceRepositoryTest {
    private InvoiceRepository testSubject;

    @BeforeEach
    public void setUp() {
        testSubject = new HashSetInvoiceRepository();
    }

    @Test
    public void testSaveWhenSetIsEmpty() {
        Invoice invoice = new Invoice("testId1", 12.5, InvoiceStatus.PAID);
        testSubject.save(invoice);
        Assertions.assertEquals(invoice, testSubject.findById("testId1"));

    }

    @Test
    public void testSaveWhenExistsWithSameIdButNewFieldsAreDifferent() {
        Invoice firstInvoce = new Invoice("testId1", 12.5, InvoiceStatus.PAID);
        Invoice secondInvoce = new Invoice("testId1", 7.4, InvoiceStatus.UNPAID);
        testSubject.save(firstInvoce);
        testSubject.save(secondInvoce);
        Assertions.assertEquals(secondInvoce, testSubject.findById("testId1"));

    }

    @Test
    public void testSave2Times() {
        Invoice firstInvoce = new Invoice("testId1", 12.5, InvoiceStatus.PAID);
        testSubject.save(firstInvoce);
        testSubject.save(firstInvoce);
        Assertions.assertTrue(1 == testSubject.findAll().size());

    }

    @Test
    public void testFindByIdWhenNotFound() {
        Assertions.assertNull(testSubject.findById("testId2"));

    }

    @Test
    public void testFindByIdWhenFound() {
        Invoice invoce = new Invoice("testId1", 12.5, InvoiceStatus.PAID);
        testSubject.save(invoce);
        Assertions.assertEquals(invoce, testSubject.findById("testId1"));
    }

    @Test
    public void testFindAllWhenEmpty() {

        Assertions.assertTrue(0 == testSubject.findAll().size());
    }

    @Test
    public void testFindAllWhenIsNotEmpty() {
        Invoice firstInvoice = new Invoice("testId1", 12.5, InvoiceStatus.PAID);
        Invoice secondInvoice = new Invoice("testId2", 7.4, InvoiceStatus.UNPAID);
        testSubject.save(firstInvoice);
        testSubject.save(secondInvoice);
        Assertions.assertTrue(2 == testSubject.findAll().size());
    }

    @Test
    public void testDeleteWhenEmpty() {
        Invoice invoce = new Invoice("testId1", 12.5, InvoiceStatus.PAID);
        Exception exception = assertThrows(EmptySetException.class, new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        testSubject.delete(invoce);
                    }
                }
        );
        Assertions.assertEquals("Set is empty!", exception.getMessage());
    }

    @Test
    public void testDeleteWhenExist() {
        Invoice invoice = new Invoice("testId1", 12.5, InvoiceStatus.PAID);
        testSubject.save(invoice);
        testSubject.delete(invoice);
        Assertions.assertTrue(0 == testSubject.findAll().size());
    }
}