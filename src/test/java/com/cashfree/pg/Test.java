package com.cashfree.pg;

import com.cashfree.pg.generated.CustomerDetails;
import com.cashfree.pg.generated.Order;
import com.cashfree.pg.service.OrderService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.protobuf.InvalidProtocolBufferException;

public class Test {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        CustomerDetails cus = CustomerDetails.newBuilder()
                .setCustomerEmail("rohit@cashfree.com")
                .setCustomerPhone("7760752036")
                .setCustomerId("12345").build();
        Order order = Order.newBuilder()
                .setOrderAmount(12.0)
                .setCustomerDetails(cus).build();

        OrderService svc = new OrderService();
        svc.createOrder(order);
    }
}
