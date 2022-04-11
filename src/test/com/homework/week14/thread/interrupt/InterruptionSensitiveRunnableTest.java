package com.homework.week14.thread.interrupt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class InterruptionSensitiveRunnableTest {
    private List<String> sharedList;
    private Thread privateSubject;

    @BeforeEach
    public void setUp() {
        this.sharedList = new LinkedList<>();
        privateSubject = new Thread(new InterruptionSensitiveRunnable(sharedList));
    }

    @Test
    public void testImmediateInterrupt() {


        privateSubject.start();
        privateSubject.interrupt();

        Assertions.assertEquals(0, sharedList.size());
    }

    @Test
    public void testInterruptIn1Sec() {

        privateSubject.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        privateSubject.interrupt();

        Assertions.assertEquals(0, sharedList.size());
    }

    @Test
    public void testInterruptIn3Sec() {

        privateSubject.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        privateSubject.interrupt();

        Assertions.assertEquals(1, sharedList.size());
    }

    @Test
    public void testInterruptIn5Sec() {

        privateSubject.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        privateSubject.interrupt();

        Assertions.assertEquals(2, sharedList.size());

    }
}