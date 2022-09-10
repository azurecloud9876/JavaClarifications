package com.behavioral.strategy.exercise2;


import java.util.LinkedList;

//Context 
public class PrintService {

    private final OrderPrinter printer;

    public PrintService(OrderPrinter printer) {
        this.printer = printer;
    }

    public void printOrders(LinkedList<Order> orders) {
        printer.print(orders);
    }
}
