package com.homework.week10.object.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServletRequestObjectFactoryTest {
    private ServletRequestObjectFactory testObject;

    @BeforeEach
    public void setUp() {
        testObject = new ServletRequestObjectFactory();
    }

    @Test
    public void testSingleGetObject() {
        Assertions.assertNotNull(testObject.getObject());
    }

    @Test
    public void testGet2Objects() {
        ServletRequestImpl firstRequest = testObject.getObject();
        ServletRequestImpl secondRequest = testObject.getObject();

        Assertions.assertNotEquals(firstRequest.getBody(), secondRequest.getBody());
        Assertions.assertNotEquals(secondRequest.getContentLength(), secondRequest.getContentLength());
    }

    @Test
    public void testGet3Objects() {
        ServletRequestImpl firstRequest = testObject.getObject();
        ServletRequestImpl secondRequest = testObject.getObject();
        ServletRequestImpl thirdRequest = testObject.getObject();
        Assertions.assertNotEquals(firstRequest.getBody(), secondRequest.getBody());
        Assertions.assertNotEquals(firstRequest.getBody(), thirdRequest.getBody());
        Assertions.assertNotEquals(secondRequest.getContentLength(), secondRequest.getContentLength());
        Assertions.assertNotEquals(secondRequest.getContentLength(), thirdRequest.getContentLength());
    }

}