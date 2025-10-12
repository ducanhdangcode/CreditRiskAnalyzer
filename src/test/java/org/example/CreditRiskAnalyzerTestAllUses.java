package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditRiskAnalyzerTestAllUses {
    @Test
    void TestRisk01() {
        CreditRiskAnalyzer analyzer = new CreditRiskAnalyzer();
        assertEquals("INVALID", analyzer.determineStatus(36, 50));
    }

    @Test
    void TestRisk02() {
        CreditRiskAnalyzer analyzer = new CreditRiskAnalyzer();
        assertEquals("HIGH_RISK", analyzer.determineStatus(10, 80));
    }

    @Test
    void TestRisk03() {
        CreditRiskAnalyzer analyzer = new CreditRiskAnalyzer();
        assertEquals("MEDIUM_RISK", analyzer.determineStatus(15, 50));
    }

    @Test
    void TestRisk04() {
        CreditRiskAnalyzer analyzer = new CreditRiskAnalyzer();
        assertEquals("LOW_RISK", analyzer.determineStatus(12, 36));
    }
}
