package com.exam.exam2;

public class OrderPrinterRunnable implements Runnable {

    private Order order;

    public OrderPrinterRunnable(Integer orderId, FileSourceOrderRepository repository) {
        FileSourceOrderRepository orderRepository = repository;
        order = orderRepository.findById(orderId);
    }

    @Override
    public void run() {
        System.out.println(order);
    }
}
