package com.meridian.payments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PaymentController {

    private static final Logger log = LoggerFactory.getLogger(PaymentController.class);

    @PostMapping("/authorize")
    public Map<String, String> authorize(@RequestBody Map<String, String> request) {
        log.info("Authorizing payment for cardHolder={}", request.get("cardHolder"));
        return Map.of("status", "APPROVED", "authCode", "AUTH-" + System.currentTimeMillis());
    }
}
