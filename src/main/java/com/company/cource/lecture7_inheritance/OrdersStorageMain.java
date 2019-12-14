package com.company.cource.homeworks.lecture7_inheritance;

import java.util.ArrayList;

public class OrdersStorageMain{
    public static void main(String[] args) {
        Order order = new Order();
        RegularOrder regularOrder = new RegularOrder();
        UrgentOrder urgentOrder = new UrgentOrder("Horrible Stranger");
        InsuredUrgentOrder insuredUrgentOrder = new InsuredUrgentOrder("Delivery Inc",1500,"Ghost Rider");
        InsuredRegularOrder insuredRegularOrder = new InsuredRegularOrder("Post & Co",950);


        ArrayList<Order> orderArrayList = new ArrayList<Order>();
        orderArrayList.add(regularOrder);
        orderArrayList.add(urgentOrder);
        orderArrayList.add(insuredUrgentOrder);
        orderArrayList.add(insuredRegularOrder);

        for(Order orderArray : orderArrayList){
            System.out.println(orderArray.toString());
        };

    }
}