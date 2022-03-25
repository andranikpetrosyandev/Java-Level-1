package com.exam.exam2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileSourceOrderRepositoryTest {

    private FileSourceOrderRepository testSubject;

    @BeforeEach
    public void setUp() {
        testSubject = new FileSourceOrderRepository(FileSourceUserRepository.getInstance());
    }

    @Test
    public void testFindByIdWhenIdIsNotFound() {
        Assertions.assertEquals(null, testSubject.findById(34));

    }

    @Test
    public void testFindByIdWhenIdIsFound() {
        Assertions.assertEquals(5, testSubject.findById(5).getId());
    }

    @Test
    public void testFindAllSize() {
        Assertions.assertEquals(9, testSubject.findAll().size());
    }

    @Test
    public void testFindAllByUserId() {
        List<Order> orders = testSubject.findAllByUserId("shawlinspire");
        Iterator<Order> iterator = orders.iterator();
        Assertions.assertEquals(3, orders.size());
        while (iterator.hasNext()) {
            Assertions.assertEquals("shawlinspire", iterator.next().getPurchasedUser().getId());
            Assertions.assertEquals("Janea", iterator.next().getPurchasedUser().getFirstName());
            Assertions.assertEquals("Dawson", iterator.next().getPurchasedUser().getLastName());
        }

    }

}