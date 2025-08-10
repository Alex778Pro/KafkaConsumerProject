package com.example.kafkaconsumerproject.service;

import com.example.kafkaconsumerproject.entity.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerOrder {
    private static final Logger log = LoggerFactory.getLogger(KafkaConsumerOrder.class);

    @KafkaListener(topics = "orders")
    public void listen(Order order) {
        log.info(
                "Новый заказ: " + order.getOrderId() +
                        " для " + order.getCustomerName() +
                        ", сумма: " + order.getTotalAmount()
        );
    }

}
