package com.hanniel.sbkafkaproducer.producer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hanniel.sbkafkaproducer.dto.PaymentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PaymentRequestProducer {
    @Value("${topics.payment.request.topic}")
    private String topicPaymentRequest;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public String sendMessage(PaymentDTO paymentDTO) throws JsonProcessingException {
        String content = objectMapper.writeValueAsString(paymentDTO);
        kafkaTemplate.send(topicPaymentRequest, content);
        return "Payment send to process";
    }

}
