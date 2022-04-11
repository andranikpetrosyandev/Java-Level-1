package com.classroom.week12.functional;

import java.util.function.Supplier;

public class IntegerSupplier implements Supplier<Integer> {
    @Override
    public Integer get() {
        return 9;
    }
}
