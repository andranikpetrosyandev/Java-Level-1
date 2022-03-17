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
        ServletRequest firstRequest = testObject.getObject();
        ServletRequest secondRequest = testObject.getObject();
        Assertions.assertNotEquals(firstRequest.getBody(), secondRequest.getBody());
        Assertions.assertNotEquals(firstRequest.getContentLength(), secondRequest.getContentLength());
    }

    @Test
    public void testGet3Objects() {
        ServletRequest firstRequest = testObject.getObject();
        ServletRequest secondRequest = testObject.getObject();
        ServletRequest thirdRequest = testObject.getObject();
        Assertions.assertNotEquals(firstRequest.getBody(), secondRequest.getBody());
        Assertions.assertNotEquals(firstRequest.getBody(), thirdRequest.getBody());
        Assertions.assertNotEquals(firstRequest.getContentLength(), secondRequest.getContentLength());
        Assertions.assertNotEquals(secondRequest.getContentLength(), thirdRequest.getContentLength());
    }

}