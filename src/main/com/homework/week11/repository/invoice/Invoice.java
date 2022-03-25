package com.homework.week11.repository.invoice;

import java.util.Objects;

public class Invoice {
    final private String id;
    private double amountToPay;
    private InvoiceStatus status;

    public Invoice(String id, double amountToPay, InvoiceStatus status) {
        this.id = id;
        this.amountToPay = amountToPay;
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return Double.compare(invoice.amountToPay, amountToPay) == 0 && Objects.equals(id, invoice.id) && status == invoice.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amountToPay, status);
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id='" + id + '\'' +
                ", amountToPay=" + amountToPay +
                ", status=" + status +
                '}';
    }
}
