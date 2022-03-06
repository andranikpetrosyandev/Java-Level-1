package com.homework.week9.invoice.service;

public class Invoice {
    private String id;
    private double amount;
    private InvoiceType type;
    private String code;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public InvoiceType getInvoiceType() {
        return type;
    }

    public void setInvoiceType(InvoiceType invoiceType) {
        this.type = invoiceType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
