package com.refactoring.chap06.chap06_1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Invoice implements Cloneable{
    protected List<Order> orders = new ArrayList<>();
    protected LocalDateTime dueDate;

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    protected String customer;

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public Invoice clone() throws CloneNotSupportedException {
        return (Invoice) super.clone();
    }
}