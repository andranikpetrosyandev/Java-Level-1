package com.homework.week9.invoice.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InvoiceReader {

    public Invoice[] read() {
        Invoice[] invoices = new Invoice[99];
        try {
            Scanner scanner = new Scanner(
                    new File("C:\\Users\\andra\\Desktop\\Java-Level-1\\src\\main\\com\\homework\\week9\\invoice\\service\\invoices.txt")
            );
            for (int j = 0; j < 100; j++) {
                if (j == 0) {
                    scanner.nextLine();
                } else {
                    invoices[j-1] = makeInvoiceObjectFromString(scanner.nextLine());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return invoices;

    }

    private Invoice makeInvoiceObjectFromString(String invoiceRow) {
        Invoice invoice = new Invoice();
        String[] invoiceParams = invoiceRow.split(",");

        invoice.setId(invoiceParams[0]);
        invoice.setAmount(Long.parseLong(invoiceParams[1]));
        invoice.setInvoiceType(InvoiceType.getEnumByString(invoiceParams[2]));
        invoice.setCode(invoiceParams[3]);
        return invoice;
    }

}
