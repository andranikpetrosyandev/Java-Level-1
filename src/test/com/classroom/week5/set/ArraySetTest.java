package com.classroom.week5.set;


import com.classroom.week7.concat.LongConcatenator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArraySetTest {

    private Set testSubject;

    @BeforeEach
    public void setUp() {
        testSubject = new ArraySet();
    }

    @Test
    public void testSizeWhenNoUsers() {
        Assertions.assertEquals(0, testSubject.size());
    }

    @Test
    public void testSizeWhenOnlyOneUserIsAdded() {
        testSubject.add(new User("a", "b"));
        Assertions.assertEquals(1, testSubject.size());
    }
    @Test
    public void testSizeWhen5SameUsersWereAdded(){
        testSubject.add(new User("a", "b"));
        testSubject.add(new User("a", "b"));
        testSubject.add(new User("a", "b"));
        testSubject.add(new User("a", "b"));
        Assertions.assertEquals(1, testSubject.size());
    }


}