package com.company.cource.homeworks.lecture7_1_inheritance;

import java.util.Random;
import java.util.UUID;


public class DeliveryApp {

    public static void main(String[] args) {

        OrdersManager ordersManager = new OrdersManager();
        Order_ ordinary = new OrdinaryOrder("24-01-2019","11:00", new Random().nextInt());
        //System.out.println(ordinary);
        ordersManager.add(ordinary);
        Order_ express = new ExpressOrder("24-01-2019","11:00", new Random().nextInt(), "RandomCourier", 2);
        ordersManager.add(express);
        Order_ insured = new InsuredOrder("24-01-2019","11:00", new Random().nextInt(), "Company Inc", 2.5);
        ordersManager.add(insured);
        ordersManager.show();

        System.out.println(ordinary.getType());
        System.out.println(express.getType());
        System.out.println(express.getType());
    }
}
