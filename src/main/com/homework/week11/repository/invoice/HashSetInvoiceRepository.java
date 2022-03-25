package com.homework.week11.repository.invoice;

import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetInvoiceRepository implements InvoiceRepository {
    private final Set<Invoice> invoiceSet = new HashSet<>();

    @Override
    public Invoice save(Invoice invoice) {
        if (invoice == null) {
            throw new NullPointerException("Param should be instance of Invoice you set null");
        }
        Invoice existingInvoice = findById(invoice.getId());
        if (existingInvoice != null) {
            invoiceSet.remove(existingInvoice);
        }
        invoiceSet.add(invoice);

        return invoice;
    }

    @Override
    public @Nullable Invoice findById(String id) {
        Iterator<Invoice> iterator = invoiceSet.iterator();
        while (iterator.hasNext()) {
            Invoice invoice = iterator.next();
            if (invoice.getId() == id) {
                return invoice;
            }
        }
        return null;
    }

    @Override
    public Set<Invoice> findAll() {
        return invoiceSet;
    }

    @Override
    public void delete(Invoice invoice) {
        if (invoiceSet.size() == 0) {
            throw new EmptySetException("Set is empty!");
        }
        invoiceSet.remove(invoice);
    }
}
