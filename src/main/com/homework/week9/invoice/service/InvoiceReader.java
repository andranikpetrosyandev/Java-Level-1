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
            scanner.nextLine();
            int lineNumber = 0;
            while (scanner.hasNextLine()) {
                invoices[lineNumber] = mapToInvoice(scanner.nextLine());
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return invoices;

    }

    private Invoice mapToInvoice(String invoiceRow) {
        String[] invoiceParams = invoiceRow.split(",");
        Invoice invoice = new Invoice(invoiceParams[0], Long.parseLong(invoiceParams[1]), InvoiceType.valueOf(invoiceParams[2]), invoiceParams[3]);
        return invoice;
    }

}
