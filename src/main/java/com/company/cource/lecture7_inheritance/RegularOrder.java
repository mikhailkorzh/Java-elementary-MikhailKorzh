package com.company.cource.homeworks.lecture7_inheritance;

public class RegularOrder extends Order {
    @Override
    public String toString() {
        return "RegularOrder{" +
                "orderID='" + orderID + '\'' +
                ", orderDate=" + orderDate +
                ", orderTime=" + orderTime +
                '}';
    }
}