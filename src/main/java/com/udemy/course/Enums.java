package com.udemy.course;

import java.util.Date;

import com.udemy.entities.Order;
import com.udemy.entities.enums.OrderStatus;

public class Enums {
  public static void main(String[] args) {
    Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

    System.out.println(order.toString());

    OrderStatus os1 = OrderStatus.DELIVERED;
    OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

    System.out.println(os2);

  }
}
