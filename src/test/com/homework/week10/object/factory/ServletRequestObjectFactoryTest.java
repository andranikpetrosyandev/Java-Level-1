package com.homework.week10.object.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServletRequestObjectFactoryTest {
    private ServletRequestObjectFactory testSubject;

    @BeforeEach
    public void setUp() {
        testSubject = new ServletRequestObjectFactory();
    }

    @Test
    public void testSingleGetObject() {
        Assertions.assertNotNull(testSubject.getObject());
    }

    @Test
    public void testGet2Objects() {
        Assertions.assertNotEquals(testSubject.getObject(), testSubject.getObject());
    }

    @Test
    public void testGet3Objects() {
        ServletRequest firstRequest = testSubject.getObject();
        ServletRequest secondRequest = testSubject.getObject();
        ServletRequest thirdRequest = testSubject.getObject();
        Assertions.assertNotEquals(firstRequest, secondRequest);
        Assertions.assertNotEquals(firstRequest, thirdRequest);
        Assertions.assertNotEquals(firstRequest, secondRequest);
        Assertions.assertNotEquals(secondRequest, thirdRequest);
    }

}