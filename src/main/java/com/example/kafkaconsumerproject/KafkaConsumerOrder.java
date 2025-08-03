package com.example.kafkaconsumerproject;

import com.example.kafkaconsumerproject.entity.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerOrder {

    @KafkaListener(topics = "orders")
    public void listen(Order order) {
        System.out.println(
                "Новый заказ: " + order.getOrderId() +
                        " для " + order.getCustomerName() +
                        ", сумма: " + order.getTotalAmount()
        );
    }

}
