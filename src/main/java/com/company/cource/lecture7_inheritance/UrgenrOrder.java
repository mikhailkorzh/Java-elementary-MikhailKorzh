package com.company.cource.homeworks.lecture7_inheritance;

class UrgentOrder extends Order {


    public  String courier;

    public UrgentOrder() {
        this.orderDate=this.orderDate.minusDays(1);
    }

    public UrgentOrder(String death_strander) {
        this.courier=death_strander;
        this.orderDate=this.orderDate.minusDays(1);
    }

    @Override
    public String toString() {
        return "UrgentOrder{" +
                "courier='" + courier + '\'' +
                ", orderID='" + orderID + '\'' +
                ", orderDate=" + orderDate +
                ", orderTime=" + orderTime +
                '}';
    }
}
