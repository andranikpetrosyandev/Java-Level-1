package com.homework.week9.invoice.service;

public enum InvoiceType {
    SAD("SAD"),
    MAN("MAN");


    public String getName() {
        return this.name;
    }

    private String name;

    InvoiceType(String sad) {
        this.name = name();
    }

    public static InvoiceType getEnumByString(String code) {
        for (InvoiceType e : InvoiceType.values()) {
            if (e.name.equals(code)) return e;
        }
        return null;
    }

}
