package com.homework.week9.generic.queue;

import com.classroom.week8.exception.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class QueueImplTest {

    private Queue testObject;

    @BeforeEach
    public void setUp() {
        testObject = new QueueImpl<String>();
    }

    @Test
    public void testWhenProduceIsNull() {

        Exception exception = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                testObject.produce(null);
            }
        });
        Assertions.assertEquals("We can't add null", exception.getMessage());

    }

    @Test
    public void testConsumeWhenContains1Item() throws QueueEmptyException {
        testObject.produce("test");
        Assertions.assertEquals("test", testObject.consume().toString());
    }

    @Test
    public void testConsumeWhenQueueIsEmpty() {
        Exception exception = assertThrows(QueueEmptyException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                testObject.consume();
            }
        });
        Assertions.assertEquals("Queue is Empty", exception.getMessage());
    }

    @Test
    public void testConsume2TimesWhenQueueContains2Items() throws QueueEmptyException {
        testObject.produce("test1");
        testObject.produce("test2");
        Assertions.assertEquals("test2", testObject.consume().toString());
        Assertions.assertEquals("test1", testObject.consume().toString());
    }
}