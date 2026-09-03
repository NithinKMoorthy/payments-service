# payments-service

Handles card authorization and settlement. Mature, reasonably maintained — except for one
dependency that turns it into a critical demo.

## Stack
- **Java 11**
- **Spring Boot 2.3.12**
- **log4j-core 2.14.1** — vulnerable to **CVE-2021-44228 (Log4Shell)**

## Modernization signals for CM
- **Critical CVE remediation**: log4j-core 2.14.1 → 2.17.1+ (Log4Shell). The sharpest
  "why modernize now" demo moment.
- Version drift: Spring Boot 2.3 → 3.x, Java 11 → 21. (Boot 2.3 predates Java 17
  support — a naive JDK bump breaks the build, which is itself a modernization finding.)
- Has tests → CM should show higher transform confidence vs. `billing-monolith`

## Build
```bash
mvn clean package
```
