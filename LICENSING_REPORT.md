# Oracle JDK to Amazon Corretto Migration — Licensing Report

## Summary

| Item | Value |
|---|---|
| **Project** | com.meridian:payments-service:2.4.0 |
| **Files scanned** | 3 Java files, 1 Dockerfile, 1 pom.xml |
| **Oracle API imports found** | 0 |
| **Issues found and fixed** | 1 (Dockerfile base image) |
| **Manual review items** | 0 |

## Dependency Table

| File | Line | Oracle API | Replacement | Status |
|---|---|---|---|---|
| N/A | — | No Oracle API imports detected | — | Pass |

## Licensing Cost Estimate

### Oracle JDK SE Universal Subscription (per-employee pricing)

| Employees | Rate | Monthly | Annual | 5-Year |
|---|---|---|---|---|
| 500 | $15.00/emp/mo | $7,500 | $90,000 | $450,000 |
| 1,000 | $12.00/emp/mo | $12,000 | $144,000 | $720,000 |
| 5,000 | $10.50/emp/mo | $52,500 | $630,000 | $3,150,000 |
| 10,000 | $10.50/emp/mo* | $105,000 | $1,260,000 | $6,300,000 |

*10,000-employee rate extrapolated from highest published tier (3,000–9,999). Actual enterprise pricing negotiated with Oracle.

### Amazon Corretto Cost

**$0** — Amazon Corretto is a no-cost, multiplatform, production-ready distribution of OpenJDK with no licensing fees.

## Modified Files

| File | Change |
|---|---|
| `Dockerfile` | Replaced `FROM maven:3.9-eclipse-temurin-17` with `FROM maven:3.9-amazoncorretto-17` |

## Manual Review Items

None — no Oracle-specific APIs or unrecognized imports were detected.

## Annotation-Processor Upgrades

Not applicable — no Lombok or other annotation processors requiring upgrade were detected.
