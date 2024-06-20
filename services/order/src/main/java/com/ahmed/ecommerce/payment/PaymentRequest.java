package com.ahmed.ecommerce.payment;

import com.ahmed.ecommerce.customer.CustomerResponse;
import com.ahmed.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}