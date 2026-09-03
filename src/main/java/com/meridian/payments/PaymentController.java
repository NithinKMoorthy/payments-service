package com.meridian.payments;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PaymentController {

    private static final Logger log = LogManager.getLogger(PaymentController.class);

    @PostMapping("/authorize")
    public Map<String, String> authorize(@RequestBody Map<String, String> request) {
        // Logging attacker-controllable input with a Log4Shell-vulnerable log4j-core.
        // CVE-2021-44228: a crafted "cardHolder" like ${jndi:ldap://...} triggers RCE.
        log.info("Authorizing payment for cardHolder={}", request.get("cardHolder"));
        return Map.of("status", "APPROVED", "authCode", "AUTH-" + System.currentTimeMillis());
    }
}
