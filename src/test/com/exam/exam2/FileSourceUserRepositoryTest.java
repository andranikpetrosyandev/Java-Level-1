package com.exam.exam2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class FileSourceUserRepositoryTest {
    FileSourceUserRepository testSubject;

    @BeforeEach
    public void setUp() {
        testSubject = FileSourceUserRepository.getInstance();
    }

    @Test
    public void getInstance() {
        FileSourceUserRepository testSubject2 = FileSourceUserRepository.getInstance();
        Assertions.assertTrue(testSubject == testSubject2);
    }

    @Test
    public void testFindByIdWhenIdIsNotFound() {
        Assertions.assertEquals(null, testSubject.findById("dairyfootbaaall"));
    }

    @Test
    public void testFindByIdWhenIdIsFound() {
        Assertions.assertEquals("impossibleimmediate", testSubject.findById("impossibleimmediate").getId());

    }

    @Test
    public void testFindAll() {
        List<User> users = testSubject.findAll();
        Assertions.assertEquals(8, users.size());
        Assertions.assertEquals("dairyfootball", users.get(0).getId());
        Assertions.assertEquals("barracudaassign", users.get(users.size() - 1).getId());


    }

}