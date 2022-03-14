package com.homework.week10.entry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryImplTest {

    @Test
    public void testWhenKyeIsStringType() {
        EntryImpl<String, Integer> entry = new EntryImpl<>();
        entry.key("custom text");
        Assertions.assertTrue(entry.key() instanceof String);
    }

    @Test
    public void testWhenValueIsStringType() {
        EntryImpl<String, Integer> entry = new EntryImpl<>();
        entry.value(12);
        Assertions.assertTrue(entry.value() instanceof Integer);
    }

}