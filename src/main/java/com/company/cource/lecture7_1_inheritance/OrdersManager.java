package com.company.cource.homeworks.lecture7_1_inheritance;

import com.company.cource.homeworks.lecture7_inheritance.Order;

import java.util.Arrays;

public class OrdersManager {

        Order_[] oredrs = new Order_[10];

        public void add(Order_ order){
            for(int i = 0; i<10; i++){
                if(oredrs[i] == null){
                    oredrs[i]=order;
                    break;
                }
            }
        }

        public void show(){
            System.out.println(Arrays.toString(oredrs));
        }
}

