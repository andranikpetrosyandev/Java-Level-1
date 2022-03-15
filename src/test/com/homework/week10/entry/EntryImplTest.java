package com.homework.week10.entry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryImplTest {

    @Test
    public void testWhenKyeIsStringType() {
        Entry<String, Integer> entry = new EntryImpl<>("custom text", 12);
        Assertions.assertTrue(entry.key() instanceof String);
        Assertions.assertTrue(entry.value() instanceof Integer);
    }
}