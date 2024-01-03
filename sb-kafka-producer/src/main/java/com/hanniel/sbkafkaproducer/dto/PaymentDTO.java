package com.hanniel.sbkafkaproducer.dto;

import java.math.BigDecimal;

public class PaymentDTO {
    private Integer number;
    private String describe;
    private BigDecimal value;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
