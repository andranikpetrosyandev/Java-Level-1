package com.exam.exam2;

public class OrderPrinterRunnable implements Runnable {

    private final int orderId;
    private final FileSourceOrderRepository orderRepository;

    public OrderPrinterRunnable(Integer orderId, FileSourceOrderRepository repository) {
        this.orderRepository = repository;
        this.orderId = orderId;
    }

    @Override
    public void run() {
        System.out.println(orderRepository.findById(orderId));
    }
}
