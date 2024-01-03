package com.hanniel.sbkafkaproducer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hanniel.sbkafkaproducer.dto.PaymentDTO;
import com.hanniel.sbkafkaproducer.producer.PaymentRequestProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private PaymentRequestProducer paymentRequestProducer;

    public String integratePayment(PaymentDTO paymentDTO) {
        try {
            return paymentRequestProducer.sendMessage(paymentDTO);
        } catch (JsonProcessingException e) {
            return "Has a erro to execute the payment" + e.getMessage();
        }
    }
}
