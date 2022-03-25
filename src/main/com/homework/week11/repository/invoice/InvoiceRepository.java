package com.homework.week11.repository.invoice;

import org.jetbrains.annotations.Nullable;
import java.util.Set;

@Repository
public interface InvoiceRepository {
    Invoice save(Invoice invoice);

    @Nullable
    Invoice findById(String id);

    Set<Invoice> findAll();

    void delete(Invoice invoice);
}
