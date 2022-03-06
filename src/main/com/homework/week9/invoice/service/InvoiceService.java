package com.homework.week9.invoice.service;


public class InvoiceService {
    public Invoice[] load() {
        InvoiceReader invoiceReader = new InvoiceReader();
        return invoiceReader.read();
    }

    public long totalAmountByType(Enum type) {
        long sum = 0;
        Invoice[] invoices = load();
        for (Invoice invoice : invoices) {
            if (invoice.getInvoiceType() == type) {
                sum += invoice.getAmount();
            }
        }

        return sum;
    }

    public Invoice[] getByType(InvoiceType type) {
        Invoice[] invoices = load();
        Invoice[] filteredArrayByInvoiceType = new Invoice[invoices.length];
        int arrayLengthCounter = 0;
        for (int i = 0; i < invoices.length; i++) {
            if (invoices[i].getInvoiceType() == type) {
                filteredArrayByInvoiceType[i] = invoices[i];
                arrayLengthCounter++;
            }
        }
        return this.modifyArrayWithCorrectLength(filteredArrayByInvoiceType, arrayLengthCounter);
    }

    public Invoice[] getByTypeAndCode(InvoiceType type, String code) {
        Invoice[] invoices = load();
        Invoice[] filteredArrayByInvoiceType = new Invoice[invoices.length];
        int arrayLengthCounter = 0;
        for (int i = 0; i < invoices.length; i++) {
            if (invoices[i].getInvoiceType() == type && invoices[i].getCode() == code) {
                filteredArrayByInvoiceType[i] = invoices[i];
                arrayLengthCounter++;
            }
        }
        return this.modifyArrayWithCorrectLength(filteredArrayByInvoiceType, arrayLengthCounter);
    }

    private Invoice[] modifyArrayWithCorrectLength(Invoice[] invoices, Integer length) {
        System.out.println(length);
        Invoice[] modifiedArray = new Invoice[length];
        int j = 0;
        for (int i = 0; i < invoices.length; i++) {
            if (invoices[i] != null) {
                modifiedArray[j] = invoices[i];
                j++;
            }
        }
        return modifiedArray;
    }

}
