package com.hanniel.sbkafkaproducer.api;

import com.hanniel.sbkafkaproducer.dto.PaymentDTO;
import com.hanniel.sbkafkaproducer.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentApi {
    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public String pay(@RequestBody PaymentDTO paymentDTO){
        return paymentService.integratePayment(paymentDTO);
    }
}
