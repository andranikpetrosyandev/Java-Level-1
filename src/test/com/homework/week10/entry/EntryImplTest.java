package com.homework.week10.entry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EntryImplTest {

    @Test
    public void testWhenKyeIsStringType() {
        Entry<String, Integer> entry = new EntryImpl<>("custom text", 12);
        Assertions.assertEquals(entry.key(), "custom text");
        Assertions.assertEquals(entry.value(), 12);
    }
}