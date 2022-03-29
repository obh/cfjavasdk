package com.cashfree.pg.service;

import com.cashfree.pg.generated.Order;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.protobuf.ProtobufMapper;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class OrderService {

    private HttpClient httpclient;

    public OrderService(){
        httpclient = HttpClient.newBuilder().build();
    }

    public void createOrder(Order order) throws InvalidProtocolBufferException {
        HttpRequest.Builder req = HttpRequest.newBuilder();
        req.setHeader("x-client-id", "321b3f5a77538c3483f8592123");
        req.setHeader("x-client-secret", "d1cb82a1aff501aa64aa0a608d2aa8cc4e9fcc1f");
        req.setHeader("x-api-version", "2022-01-01");

        JsonFormat.Printer p = JsonFormat.printer();
        String json = p.print(order);

        System.out.println(json);
        URI uri = URI.create("https://sandbox.cashfree.com/pg/orders");
        HttpRequest request = HttpRequest.newBuilder(uri)
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();

//        HttpClient.newHttpClient()
//                .sendAsync(request, HttpResponse.BodyHandlers.ofString())
//                .thenApply(HttpResponse::statusCode)
//                .thenAccept(System.out::println);

    }
}
