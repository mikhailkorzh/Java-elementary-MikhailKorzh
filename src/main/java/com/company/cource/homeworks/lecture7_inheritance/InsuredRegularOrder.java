package com.company.cource.homeworks.lecture7_inheritance;
//InsuredRegularOrder
public class InsuredRegularOrder extends RegularOrder{
    String companyName;
    int amount;

    public InsuredRegularOrder(String companyName, int amount) {
        this.companyName = companyName;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "InsuredRegularOrder{" +
                "companyName='" + companyName + '\'' +
                ", amount=" + amount +
                ", orderID='" + orderID + '\'' +
                ", orderDate=" + orderDate +
                ", orderTime=" + orderTime +
                '}';
    }
}