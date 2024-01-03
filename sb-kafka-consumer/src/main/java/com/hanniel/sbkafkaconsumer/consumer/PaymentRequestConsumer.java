package com.hanniel.sbkafkaconsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentRequestConsumer {

    @KafkaListener(
            topics = "${topics.payment.request.topic}",
            groupId = "payment-request-consumer-1"
    )

    public void consume(String message) {
        System.out.println("================================Receiver message=====================" + message);
    }
}
