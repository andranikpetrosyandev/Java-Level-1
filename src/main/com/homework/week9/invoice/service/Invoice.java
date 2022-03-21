package com.homework.week9.invoice.service;

public class Invoice {
    private String id;
    private double amount;
    private InvoiceType type;
    private String code;

    public Invoice(String id, double amount, InvoiceType type, String code) {
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.code = code;
    }


    public String getId() {
        return id;
    }


    public double getAmount() {
        return amount;
    }


    public InvoiceType getInvoiceType() {
        return type;
    }

    public String getCode() {
        return code;
    }


    @Override
    public String toString() {
        return "Invoice{" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                ", type=" + type +
                ", code='" + code + '\'' +
                '}';
    }
}
