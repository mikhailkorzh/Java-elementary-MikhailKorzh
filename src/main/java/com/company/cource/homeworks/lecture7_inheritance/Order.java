package com.company.cource.homeworks.lecture7_inheritance;

import java.time.LocalDate;
import java.time.LocalTime;

public class Order {

    public String orderID=getOrderID();
    LocalDate orderDate = LocalDate.now();
    LocalTime orderTime = LocalTime.now();

    public Order(String orderID, LocalDate orderDate, LocalTime orderTime) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
    }


    public Order() {

    }

    public LocalDate getOrderDate() {

        return orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID='" + orderID + '\'' +
                ", orderDate=" + orderDate +
                ", orderTime=" + orderTime +
                '}';
    }

    public String getOrderID() {
        return "POSTEDSHIPMENT"+1000+(10000 + (int) (Math.random() * 99999));
    }

    /*public void setOrderID(String orderID) {
        this.orderID = orderID;
    }*/
}