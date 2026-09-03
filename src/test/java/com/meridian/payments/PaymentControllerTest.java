package com.meridian.payments;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaymentControllerTest {

    @Test
    void authorizeReturnsApproved() {
        Map<String, String> result = new PaymentController()
                .authorize(Map.of("cardHolder", "Jane Doe", "amount", "42.00"));
        assertEquals("APPROVED", result.get("status"));
    }
}
