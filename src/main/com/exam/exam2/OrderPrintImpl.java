package com.exam.exam2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderPrintImpl {

    public void printOrder(int orderId) {
        OrderPrinterRunnable orderPrinterRunnable = new OrderPrinterRunnable(orderId, new FileSourceOrderRepository());
        orderPrinterRunnable.run();
    }

    public void printOrderList(int from, int to) {

        List<Runnable> runnable = new ArrayList<>();
        for (int i = from; i <= to; i++) {
            runnable.add(new OrderPrinterRunnable(i, new FileSourceOrderRepository()));
        }

        Iterator<Runnable> iterator = runnable.iterator();
        while (iterator.hasNext()) {
            iterator.next().run();
        }

    }
}
