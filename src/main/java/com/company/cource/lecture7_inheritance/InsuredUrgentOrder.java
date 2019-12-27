package com.company.cource.homeworks.lecture7_inheritance;

public class InsuredUrgentOrder extends UrgentOrder{

    String companyName;
    int amount;

    public InsuredUrgentOrder (String companyName, int amount, String courier){
        this.companyName=companyName;
        this.amount=amount;
        this.courier = courier;
    }


    @Override
    public String toString() {
        return "InsuredUrgentOrder{" +
                "companyName='" + companyName + '\'' +
                ", amount=" + amount +
                ", courier='" + courier + '\'' +
                ", orderID='" + orderID + '\'' +
                ", orderDate=" + orderDate +
                ", orderTime=" + orderTime +
                '}';
    }
}